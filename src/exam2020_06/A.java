package exam2020_06;

import java.util.ArrayList;

public class A {
	
	ArrayList<Persona> p /* = new ArrayList<>()*/;   //se si decommenta questo frammento 
	                                                 //di codice l'output e' diverso
	
	public void foo() {
		try {
			System.out.println("Length:");
			System.out.println(p.size());  //errore: e' p.size(), non p.length!
			System.out.println("Done");
		} catch (ArrayIndexOutOfBoundsException e) { //errore: e' ArrayIndexOutOfBoundsException,
			                                         // non ArrayOutOfBounds!
			System.out.println("ArrayIndexOutOfBounds");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		
		System.out.println("Exit");

	}

	
	public static void main(String[] args) {
		A a =new A();
		a.foo();

	}

}

/* il codice non compilava a causa di due errori, che sono segnalati sopra;
 * il risultato NON E' IL LANCIO DI UNA ECCEZIONE: si dice che viene lanciata una eccezione se si 
 * tratta di eccezione non gestita nel codice;  
 * 
 * L'output e': 
 * 
 *  Length:
 *  NullPointerException
 *  Exit
 *  
 *  perche' la variabile p non e' stata istanziata, quindi si tenta una chiamata su una locazione 
 *  di memoria che non esiste.
 *  
 *  
 *  ****************NOTA DI TEORIA******************
 *  se si tenta di invocare un metodo o un attributo pubblico che non esiste, 
 *  il risultato non e' il lancio di una eccezione, ma un Error, che quindi non viene mai
 *  "acchiappato" da alcun catch. Questi errori sono di solito segnalati gia' dal compilatore.
 *  */
