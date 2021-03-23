
class MojeBmi{
	
	private int wzrost = 0;
	private int waga = 0;
	
	//KONSTRUKTOR
	public MojeBmi(int wzrost, int waga){
		this.wzrost = wzrost; //this - odwołuje się do atrybutów OBIEKTU
		this.waga = waga;
	}
	
	//metoda zwracająca BMI jako liczbę zmiennoprzecinkową
	public double mojeBmi(){
		return waga/((double)wzrost/100*(double)wzrost/100);
	}
	
	//METODY pobierające dane z pól wzrost i waga, oraz zmieniające wartości tych pól
	//Są to tak zwane GETTERY i SETTERY
	
	//Zmiana wartości atrybutów obiektu
	public void setWzrost(int wzrost){
		this.wzrost = wzrost;
	}
	
	public void setWaga(int waga){
		this.waga = waga;
	}
	
	//Pobieranie atrybutów obiektu
	public int getWzrost(){
		return wzrost;
	}
	public int getWaga(){
		return waga;
	}
	
} 
