package AspectOrientedProgramming;

public class ExerciseBackground_CustomClassLoaders {
    /**
     * Remember that handy little unit testing framework you created a couple exercises ago?
     *
     * You noticed that in the framework's current state, the test classes have to be hard-coded into the static
     * TESTS list inTestRunner.java. That's not great, because it means you have to update the framework's test runner
     * code every time you add a new test. It's also pretty awkward that the unit tests are in the same directory
     * as the framework code.
     *
     * You got an idea to make it a lot more useful — what if you load the compiled test classes at runtime?
     * Then, the test runner can just instantiate them by name and run them that way. Because you will be loading
     * already-compiled test classes, this also means the unit tests won't have to live in the same directory
     * as the framework code.
     *
     * You will do this by rewriting the TestRunner to use a custom ClassLoader to load the test classes from
     * an external "tests" folder. Your starter code for this exercise is the solution code to the Testing with
     * Reflection: Part 3 exercise. You will need to change it in the following ways:
     *
     * Update the main() method to take two command-line arguments: the first is the external test directory,
     * the second is the name of the test class that should be run.
     *
     * Delete the static TESTS list; your new code will have to load the class dynamically, using only the
     * location and name information from the command-line arguments.
     *
     * Add code to load the test class by name, using the command-line arguments. The easiest way to do
     * this is to use Class.forName(<name>, true, <custom ClassLoader>).
     *
     * You can write your own ClassLoader subclass if you want the practice, but it's faster in this case
     * to convert the test directory name to a java.net.URL (for example: Path.of(args[0]).toUri().toURL())
     * and then use a URLClassLoader to do the class loading.
     *
     * When you're finished with the code, compile and run the tests:
     * javac *.java * /*.java
     *java - ea TestRunner tests/CalculatorTest
     *
     * Note: In addition to the same -ea JVM option as last time, you might notice the dubious * file
     * expansions given to the javac command. If you ever catch yourself writing a command like this in
     * the real world, you should seriously consider switching to a modern tool such as Maven (You'll
     * get a small taste for how Maven works in the course project). For the purposes of this exercise,
     * this command is the simplest way to compile all .java files in the current folder and all subfolders.
     *
     * The program output should be the same as before:
     *
     * Passed tests: [CalculatorTest#testAddition]
     * FAILED tests: [CalculatorTest#testSubtraction]
     *
     * But this time the tests don't have to be hard-coded into the test runner,
     * and they are allowed to live in a separate directory. Neat!
     */

}