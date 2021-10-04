package exam2021_06;
//il codice, cosi' come sta nel testo, non compila: un parametro di tipo A non e' valido 
//per il metodo foo, perche' B e C sono A, ma non e' vero il viceversa.
// si tratta di un Error, non di una Exception, quindi non viene acchiappato dal catch e l'errore
//di compilazione rimane. 
public class Es4 {

	public static void main(String[] args) {
		try {
			foo(new B());
			foo(new A()); //
			foo(new C());
		}
		catch(Exception e) {
			System.out.println("Error!");
		}

	}	
	
	public static void foo(A a) { //per risolvere l'errore, basta aggiungere un metodo del genere. 
		System.out.println("foo");
	}

	public static void foo(B b) { //per risolvere il terzo punto basta cancellare questo metodo. 
		System.out.println("B");
	}

	public static void foo(C c) {
		System.out.println("C");
	}
	


}
