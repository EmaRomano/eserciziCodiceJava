package exam2021_02;

public class Content {
	protected String nomeFile; //uno dei modi per risolvere l'errore e' cambiare questo
	                           //modificatore di accesso da private a protected;
	                           //oppure si poteva lasciarlo private, definire un getter
	                           //e poi richiamarlo nella sottoclasse con super.getNomeFile(),
	                           // o anche con getNomeFile() e basta. 
	                           
	
	public void showDetails() {
		System.out.println("Nome File: "+nomeFile);
	}
	
	public void setNomeFile(String nomeFile) {
		this.nomeFile=nomeFile;
	}
	
	//introduco un banale esempio di overloading:
	public void showDetails(String stringaACaso) {
		System.out.println("Nome File: "+nomeFile+stringaACaso);
	}
	
//	protected String getNomeFile() {
//		return nomeFile;
//	}
	

}
