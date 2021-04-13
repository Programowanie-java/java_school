 
class Osoba{
	private String imie = "John";
	private String nazwisko = "Doe";
	private int waga = 0;
	private int wzrost = 0;
	
	//KONSTRUKTOR 1 Nie znamy imienia i nazwiska
	public Osoba(int wzrost, int waga){
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
	//KON 2 Nie znamy wzrostu i wagi
	public Osoba(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public Osoba(String imie, String nazwisko,int wzrost, int waga){
		System.out.println("PIERWSZY");
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
	public Osoba(String nazwisko,int wzrost, String imie, int waga){
		System.out.println("DRUGI");
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
		
	
	@Override
	public String toString(){
		return imie+" "+nazwisko+"\nwaga = "+waga+"\nwzrost = "+wzrost;
	}
	
}
