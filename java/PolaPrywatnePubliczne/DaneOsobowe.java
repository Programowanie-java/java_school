
class DaneOsobowe{
	private String pesel = "12345678901";
	public int wiek = 20;
	public int wzrost = 177;
	public int waga = 88;
	//zmienne do adresu zamieszkania!!!
	String miasto = "Kożuchów";
	String ulica = "Zielona";
	int nr_domu = 20;
	int nr_mieszkania = 3;
	String kod = "67-120";
	
	
	public double mybmi(){
		//Rzutowanie int na double:  (double)wzrost
		System.out.println("Osoba o peselu: "+pesel);
		return waga/((double)wzrost/100*(double)wzrost/100);
	}
	//metoda wyświetlająca adres zamieszkania!!!
	public void myAdress(){
		System.out.println("Moja wizytówka: "
		+"\nMiasto: "+miasto+" "+kod
		+"\nUlica: "+ulica+" "+nr_domu+"/"+nr_mieszkania);
	}
} 
