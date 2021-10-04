package exam2020_06bis;

//il codice compila ed esegue senza eccezioni;
//sono ovviamente presenti due esempi di polimorfismo (overrides) nei due metodi delle sottoclassi

public class SomeClass {
	
	public static void foo() { //static solo per comodita'
		Train t =new Train();
		Vehicle v1 = t;
		Vehicle v2=new Car();
		
		t.makeSound();
		v1.makeSound();
		v2.makeSound();
	}

	
	
	public static void main(String[] args) {
		
		foo();


	}

}
