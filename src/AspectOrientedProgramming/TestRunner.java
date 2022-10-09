package AspectOrientedProgramming;

import AspectOrientedProgramming.tests.CalculatorTest;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class TestRunner {

    // TODO: Delete the static TESTS list; your new code will have to load the class dynamically,
    //  using only the location and name information from the command-line arguments.
    // private static final List<Class<?>> TESTS = List.of(CalculatorTest.class);

    public static void main(String[] args) throws Exception {
        // TODO: Make sure the user has passed in two arguments: one for the test directory, and one
        //       with the name of the test class to run.
        if (args.length != 2) {
            System.out.println("Usage: TestRunner [test foler] [test name]");
            return;
        }

        List<String> passed = new ArrayList<>();
        List<String> failed = new ArrayList<>();
        // load the unit test using the new command line arguments
        Class<?> testClass = getTestClass(args[0], args[1]);

        // TODO: Rewrite this for-loop. Instead of using the TESTS list (which you should have deleted),
        //       locate the test using the command-line arguments and a custom ClassLoader. Then call
        //       Class.forName(className, true, loader) using the custom ClassLoader for the third
        //       parameter.
        //
        //       The code to record passed/failed tests should pretty much stay the same.

        for (Method method : testClass.getDeclaredMethods()) {
            // loop through and run the annotated methods, recording the tests that pass and fail
            if (method.getAnnotation(Test.class) != null) {
                try {
                    UnitTest test = (UnitTest) testClass.getConstructor().newInstance();
                    test.beforeEachTest();
                    method.invoke(test);
                    test.afterEachTest();
                    passed.add(getTestName(testClass, method));
                } catch (Throwable throwable) {
                    failed.add(getTestName(testClass, method));
                }
            }
        }

        System.out.println("Passed tests: " + passed);
        System.out.println("FAILED tests: " + failed);
    }

    private static String getTestName(Class<?> klass, Method method) {
        return klass.getName() + "#" + method.getName();
    }

    private static Class<?> getTestClass(String testFolder, String className) throws Exception{
        // have to pass in a custom class loader to load classes from the other directory
        // the easiest way is to convert the folder path to a URL, then use a URL class loader
        // then use "Class.forName" to load the class dynamically
        URL testDir = Path.of(testFolder).toUri().toURL();
        URLClassLoader loader = new URLClassLoader(new URL[]{testDir});
        Class<?> klass = Class.forName(className, true, loader);
        if (!UnitTest.class.isAssignableFrom(klass)){
            throw new IllegalArgumentException("Class" + klass.toString() + "must implement UnitTest");
        }
        return klass;
    }
}