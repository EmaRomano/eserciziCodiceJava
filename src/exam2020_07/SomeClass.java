package exam2020_07;

public class SomeClass {
	
	public static void foo() { //lo faccio static solo per comodità di test
		Yell y =new Yell();
		Echo e = new Echo();
		
		y.say("HELLO GUYS");
		e.say("HELLO WORLD");
		
	}

	public static void main(String[] args) {
		
		foo();
		
	}

}

/*il codice compila correttamente e l'esecuzione non lancia eccezioni;
 * 
 * non e' presente un esempio di override, ma di overload: il metodo say in Echo
 * ha una signature diversa rispetto al metodo say in Yell: di fatto, si tratta di un metodo diverso. 
 * (se si prova ad aggiungere l'annotazione @Override prima del metodo say in Echo,
 *  ne risulta addirittura un errore di compilazione: il compilatore ci avvisa che stiamo
 *  commettendo un errore concettuale)
 *  E' possibile introdurre un esempio di override in diversi modi; uno e' stato scritto nella classe Echo. 
 * */
