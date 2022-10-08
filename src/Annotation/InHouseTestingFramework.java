package Annotation;

public class InHouseTestingFramework {
/**
 * Background:
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

}
