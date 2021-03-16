
class PolaPrywatnePubliczne{
	//Definiowanie zmiennych/obiektów globalnie!!!
	static DaneOsobowe dos;
	
	public static void main(String [] args){
		//Stworzenie obiektu
		dos = new DaneOsobowe(); //od tego meomentu mogę używać nazwy: dos
		//System.out.println("1 os BMI: "+ dos.mybmi()   );
		dos.wzrost = 192;
		dos.waga = 94;
		//System.out.println("2 os BMI: "+ dos.mybmi()   );
		dos.myAdress();
	}
	
} 
