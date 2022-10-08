package Annotation;

public class Exercise_InHouseTestingFramework {
/**
 * Part I Background:
 *
 *
 * Your team at Udacisearch has a lot of business logic written in Java, but the test coverage is not very good!
 *
 * You have identified the lack of testing as an area for improvement, and to help address the issue, you are developing
 * a proprietary testing framework for running Java unit tests. Sure, there are plenty of existing unit testing
 * frameworks for Java (such as JUnit), but your legal team has told you due to contractual and licensing reasons,
 * an in-house testing solution is required.
 *
 * You briefly discussed your plans with a teammate, and you already have a basic idea for how to design the testing framework:
 *
 * 1. Test engineers will write Java classes that contain their unit tests. These test classes will extend a base
 * interface, UnitTest defined by the framework. UnitTest provides two abstract methods:
 * void beforeEachTest() runs before each unit test to set up the test environment; and
 * void afterEachTest() runs after each unit test to clean up the test environment By the way,
 * these methods will allow test engineers to create simple test fixtures, which are a fundamental concept in unit testing.
 *
 * 2. Next, the test engineers will mark their "top-level" unit test methods with a @Test annotation provided
 * by your framework. There may be other helper methods used to create test objects or assist with the test
 * environment, but only the actual unit test methods should be annotated with @Test.
 *
 * 3. Finally, a TestRunner class has a main() method that decides which tests to run. It finds unit tests
 * annotated with @Test, runs them, and reports the test results.
 * There is a lot to unpack here!
 *
 * For starters, you will be completing the most basic piece: defining the custom @Test annotation.
 * he other parts of the testing framework will be implemented in later exercises.
 *
 * This exercise should be pretty short; the starter code already defines the UnitTest interface and
 * a sample unit test class (remember the Calculator class from Lesson 1?).
 * Just define the @Test annotation (in its own Java file), and make sure to give it the appropriate visibility,
 * target element (@Target) and retention policy (@Retention) for the use cases described above.
 * If you need a reminder about these concepts, you can go back to the previous page in this lesson.
 *
 * Next, open up CalculatorTest.java and annotate the testAddition and testSubtraction methods with the new @Test annotation.
 */

/**
 * Part 2
 *
 * Now, it's time to fill out TestRunner.java which decides which tests to run (by finding methods annotated with
 * @Test) and then reports the test results.
 *
 * The TestRunner has already been partially filled in for you. Iterate through TESTS (the static list of test classes)
 * and use the reflection API to do the following:
 *
 * Make sure the test class implements UnitTest. You can do this with Class#isAssignableFrom()).
 * Create an instance of the test class and cast it to be a UnitTest. You can do this by calling
 * Class#getConstructor()) with no arguments, and then calling the newInstance()) method.
 * For each method with the @Test annotation:
 * Call UnitTest#beforeEachTest(), then invoke the test method (use Method#invoke()), and then call UnitTest#afterEachTest().
 * If the test threw any errors, record that test as having failed. Otherwise, record that test as having passed.
 * At the end of the main() method, you should print out the results (see below for an example).
 *
 * Compile and run the test runner to make sure it works. (Note: One unit test in CalculatorTest.java
 * should intentionally fail — this is so that you can see what happens for both passing and failing tests.)
 *
 * javac TestRunner.java
 * java -ea TestRunner
 * Note: See the -ea JVM option? That stands for "enable assertions", which makes the assert statements
 * in CalculatorTest.java actually throw AssertionErrors. There are much more robust assertion libraries
 * out there (you'll see one such library in the course project), but for the purposes of this exercise,
 * assert keeps things simple.
 *
 * After running the program, aim for output similar to this:
 *
 * Passed tests: [CalculatorTest#testAddition]
 * FAILED tests: [CalculatorTest#testSubtraction]
 */

}
