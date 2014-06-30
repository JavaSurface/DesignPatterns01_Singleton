/*
 * Java has several design patterns Singleton Pattern being the most commonly used. Java Singleton pattern 
 * belongs to the family of design patterns, that govern the instantiation process. This design pattern proposes 
 * that at any time there can only be one instance of a singleton (object) created by the JVM.
 * 
 * Singletons can be used to create a Connection Pool. If programmers create a new connection object in every 
 * class that requires it, then its clear waste of resources. In this scenario by using a singleton connection 
 * class we can maintain a single connection object which can be used throughout the application.
 */
public class Singleton {

   // Object instance
   private static Singleton instance;

   // The class’s default constructor is made private, which prevents the direct instantiation of the 
   // object by other classes
   private Singleton(){
   }

   /*
    * We write a public static getter or access method to get the instance of the Singleton Object at runtime. 
    * First time the object is created inside this method as it is null. Subsequent calls to this method returns 
    * the same object created as the object is globally declared (private) and the hence the same referenced object 
    * is returned
    * 
    * A static modifier is applied to the instance method that returns the object as it then makes this
    * method a class level method that can be accessed without creating an object.
    * 
    * As an improvement, we can make the method synchronized to prevent Thread Problems. 
    * 
    */
   public static synchronized Singleton getInstance() {
      if (instance == null)
         instance = new Singleton();
      return instance;
   }
   
   /*
    * We can still be able to create a copy of the Object by cloning it using the Object’s clone method.
    * This again violates the Singleton Design Pattern’s objective. So to deal with this we need to override 
    * the Object’s clone method which throws a CloneNotSupportedException exception.
    */
   public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
   
}