package exam2021_01;
/* il codice, cosi' come stava, non compilava. Il modo piu' logico perche'
 * la compilazione avesse successo e' stato rendere Guitar sottoclasse di 
 * MusicalInstrument.
 * 
 * Per risolvere il secondo punto basta aggiungere un metodo "solo()" in MusicalInstrument. 
 * 
 * Per il terzo punto, tenendo conto delle modifiche apportate con i punti precedenti, 
 * i metodi play() e solo() sono esempi di overrriding; per introdurre un esempio di 
 * overloading basta aggiungere, ad esempio, un metodo play(int n) in una classe qualunque della gerarchia.
 * 
 */

public class Band {

	public static void main(String[] args) {
		MusicalInstrument one = new Drum();
		MusicalInstrument two = new Guitar();
		
		two.play();
		one.play();
		
	}

}
