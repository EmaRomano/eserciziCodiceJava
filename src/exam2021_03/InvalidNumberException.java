package exam2021_03;

public class InvalidNumberException extends Exception {
	private String msg;
	
	public InvalidNumberException(String msg) {
		this.msg=msg;
	}

	public String getMsg() { //aggiunto getter per risolvere l'errore
		return msg;
	}
	
	

}
