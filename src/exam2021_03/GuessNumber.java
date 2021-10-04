package exam2021_03;

public class GuessNumber {
	private int number;

	public GuessNumber() {
		this.number = 42;
	}
	
	public boolean guess(int n) throws InvalidNumberException { //correzione: mancava la clausola throws
		if(n<0) {
			throw new InvalidNumberException("!!!");
		}
		
		return n==number;
	}
	

}
