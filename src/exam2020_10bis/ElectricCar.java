package exam2020_10bis;

public class ElectricCar extends Car {

	void revEngine() {}; //errore corretto: questa classe deve implementare tutti i metodi astratti 
	                     //della sua superclasse astratta
	
	//banale esempio di overload:
	void revEngine(int n) {}

}
