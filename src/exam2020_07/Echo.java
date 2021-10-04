package exam2020_07;

public class Echo extends Yell {
	
//	@Override
	public void say(String message, int times) {
		System.out.println("!!!");
		for(int i=0; i<times; i++) {
			System.out.println(message);
		}
	}
	
	//esempio di override:
	
	@Override //l'annotazione non e' obbligatoria, ma utile, perche' ci puo' segnalare eventuali errori.
	public void say(String message) {
		System.out.println("!!!");
		for(int i=0; i<3; i++) {
			System.out.println(message);
		}
	}
	

}
