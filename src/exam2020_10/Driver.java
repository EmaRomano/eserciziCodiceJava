package exam2020_10;
//si cerca di invocare un metodo su un oggetto null: il risultato è una NullPointerException
// il codice compila ed esegue SENZA LANCI DI ECCEZIONI in output.
public class Driver {

	public static void main(String[] args) {
		Foo f = new Foo();
		f.doSomething(null);

	}

}
