package DynamicProxy;

public class ExerciseBackground {
    /**
     * Hey, remember that UdacisearchClient class you used in some previous exercises? Yeah, that one.
     * Don't worry — this will be the last time you'll be adding to it.
     *
     * Your team is testing out a trendy, schemaless NoSQL database for storing client records.
     * To look client info up from this database, you give it a numeric (long) ID, and it gives you back a
     * Map<String, Object> of properties: the keys in the map are the String names of client properties,
     * and the values in the map could be any Object, depending on what the property is.
     *
     * You would like to create a prototype data access object for this database, and a Dynamic Proxy is
     * the perfect tool for the job. What's so "dynamic" about this proxy, you might ask? Well, the proxy
     * itself is implemented at runtime. This means you can create a dynamic proxy for any interface, and
     * the proxy implements that interface dynamically — as methods get called on the proxy object,
     * the proxy is able to examine the method calls and arguments as they come in, and decide on-the-fly
     * how to handle them. In this case, your dynamic proxy will be handling method calls by looking up
     * properties from the property map (a Map<String, Object>) discussed earlier.
     *
     * Notice that this time, UdacisearchClient is an interface and not a class. That's because Java's
     * dynamic proxy (java.lang.reflect.Proxy) only works on interfaces, not classes.
     *
     * The starter code already takes care of some boilerplate for you, but if you try to run it now,
     * it will throw a NullPointerException. All you have to do is fill in the UdacisearchClientFactory.
     * Handler static inner class. In the invoke() method:
     *
     * Call Method#getName() to get the name of the method that is being called on the proxy.
     * Convert the method name to a camelCase property name. For example, a method name of "getBillingAddress"
     * should result in a property name of "billingAddress". You can use the provided static getPropertyName()
     * method to take care of this for you.
     *
     * Look in the properties map for the value corresponding to that named property, and return the value.
     *
     * Running the solution
     * Main.java has already been filled in for you! Try it out:
     *
     * javac Main.java
     * java Main
     *
     * If everything worked, you should see the client information printed to standard output:
     *
     * {quarterlyBudget=8000, numEmployees=5, name=CatFacts LLC, timeZone=America/Los_Angeles, id=17,
     * billingAddress=555 Meowmers Ln, Riverside, CA 92501, contractStart=2020-10-11T23:03:39.374133Z,
     * contractLength=PT4320H}
     * UdacisearchClient{name='CatFacts LLC', id=17, quarterlyBudget=8000, numEmployees=5,
     * contractStart=2020-10-11T23:03:39.374133Z, contractLength=PT4320H, timeZone=America/Los_Angeles,
     * billingAddress='555 Meowmers Ln, Riverside, CA 92501'}
     *
     * Note: If running the code produced a NullPointerException, there is an issue with your solution.
     * The starter code throws a NullPointerException because the dynamic proxy returns null for every method call!
     */
}
