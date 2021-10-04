package exam2020_09;
//il codice compila senza errori ed esegue senza lanci di eccezioni;

public class TestClass {

	public static void test() { //l'ho fatto static solo per comodita' di test
		Greeter g = new Greeter();
		
		Person person = new Person("Amy");
		Pirate pirate = new Pirate("Bill");
		Person test = pirate;
		
		g.greet(person);
		g.greet(pirate);
		g.greet(test);
		
	}
	
	public static void main(String[] args) {
		test();
	}

}

/************************RICHIAMI DI TEORIA************************/
/* Quando ho una gerarchia: 
 * 
 * SottoClasse -----(estende)----> SuperClasse
 * 
 * ed uso un oggetto di questo tipo:
 * 
 * SuperClasse oggetto = new SottoClasse();
 * 
 * "oggetto" e' una variabile di tipo SuperClasse, che pero' "punta" ad una istanza di tipo SottoClasse.
 * 
 * Per evitare di fare confusione, basta ricordare che:
 * 
 * 1) con "oggetto" posso invocare solo metodi di SuperClasse, non metodi propri di SottoClasse, altrimenti 
 * ne risulta un errore di compilazione (come se cercassi di invocare un metodo che non esiste). Se voglio 
 * invocare un metodo di questo tipo, devo operare un downcasting:
 *  
 *       (SottoClasse)oggetto.metodoProprioDiSottoClasse(....);
 *       
 * TUTTAVIA (!!!) se viene invocato un metodo di SuperClasse di cui sia stato fatto l'override in SottoClasse,
 * l'override viene riconosciuto nell'invocazione: il metodo viene cioe' invocato come se "oggetto" fosse 
 * una variabile di tipo SottoClasse. Questo e' il motivo per cui nell'ultima riga in output viene stampato 
 * "Bill the pirate" e non "Bill".
 * 
 * 2) se "oggetto" viene usato come parametro in un metodo, esso viene riconosciuto come variabile di tipo
 *  SuperClasse; questo e' il motivo per cui nell'ultima riga in output viene stampato 
 * "Hi, " e non "Ahoy, ". 
 * 
 *
 */
