package exam2021_03;
//TODO rispondi al terzo punto
public class Main {

	public static void main(String[] args) {
		GuessNumber g = new GuessNumber();
		
		try {
			System.out.println(g.guess(123));
			System.out.println(g.guess(-99));
			System.out.println(g.guess(42));
		} catch (InvalidNumberException e) {
			System.out.println(e.getMsg()); //correzione errore: msg e' un attributo privato;
			                                // corretto aggiungendo un getter all'eccezione 
		}

	}

}
