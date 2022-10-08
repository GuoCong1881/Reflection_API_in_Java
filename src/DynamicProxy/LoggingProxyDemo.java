package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;

/**
 * LoggingProxy is a dynamic proxy which logs all method invocations to standard output
 */
public final class LoggingProxyDemo {
    public static void main(String[] args) {
         Set<String> targetSet = new HashSet<>();

         //the proxy is delegating to a set, we want the proxy to implement the set interface
         Object proxy = Proxy.newProxyInstance(
                 LoggingProxyDemo.class.getClassLoader(),
                 // class loader
                 new Class[]{Set.class},
                 // the interface the proxy should implement
                 new LoggingInvocationHandler(targetSet));
                 // out custom invocation handler
         Set<String> loggedSet = (Set<String>) proxy;
         loggedSet.add("item");
         // if we invoke a method directly on the underlying set, the method call does not get logged
         // because it never goes through the custom invocation handler
         System.out.println(targetSet.contains("item"));
    }

    static class LoggingInvocationHandler implements InvocationHandler {
    // to print out the name of the class and the name of the methods,
    // and then delegates the method call directly to the underlying set
        private final Object targetObject;
        public LoggingInvocationHandler(Object targetObject){
            this.targetObject = targetObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(targetObject.getClass() + "." + method.getName() + "()");
            return method.invoke(targetObject, args);
        }
    }


}
