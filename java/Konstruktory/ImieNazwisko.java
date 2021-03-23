
class ImieNazwisko{
	private String imie = "";
	private String nazwisko = "";
	
	public ImieNazwisko(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	//Metoda wyświetlająca powitanie:
	// Witaj Adam Stelmaszyk   - imię i nazwisko wprowadzone w konstruktorze
	public void witaj(){
		System.out.println("Witaj "+imie+"  "+nazwisko);
	}
	
}
