public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Visibility compilation error
		// Singleton obj = new Singleton();
		
		// Compilation error not allowed
		Singleton obj = Singleton.getInstance();
		
		// Business Logic
		System.out.println("Singleton object obtained - " + obj);

	}

}
