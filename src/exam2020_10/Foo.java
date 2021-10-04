package exam2020_10;

public class Foo {
	void doSomething(Object o) {
		try {
			System.out.println("Before");
			o.toString();
			System.out.println("After");
		}
		catch (Exception e) {
			System.out.println("Exception");
		} 
		finally {
			System.out.println("Done");

		}
	}

}
