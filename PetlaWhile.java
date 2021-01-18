import java.util.Random;

class PetlaWhile{
	public static void main (String[] a){
		int as_i; //definicja/inicjalizacja/stworzenie zminnej
		as_i = 0; //przypisanie wartości do zmiennej
		System.out.println("WHILE");
		Random r = new Random(); //Przygotowanie do losowania liczby
		int licznik = 0;
		
		while(as_i!=20){
			as_i = r.nextInt(100); //wylosuj liczbę z zakresu 0 - 99
			licznik++;
			System.out.println(as_i);
		}
		
		System.out.print("20 wylosowana jako: "+licznik);
	}
}
