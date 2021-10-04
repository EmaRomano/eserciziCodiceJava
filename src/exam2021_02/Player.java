package exam2021_02;
//il senso dell'esercizio e' verificare di aver capito che gli attributi ed i metodi privati 
//non sono accessibili direttamente, NEMMENO DALLE SOTTOCLASSI.

public class Player {

	public static void main(String[] args) {
		Content c1 = new VideoContent();
		Content c2 = new AudioContent();
		c1.setNomeFile("Funny Cat Moments");
		c2.showDetails();
		c1.showDetails();

	}

}
