import java.util.Scanner;

public class Zmienne {
	public static void main (String[] args) {
		//Pobieranie danych od użytkownika - przygotowanie
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wpisz jedno słowo i naciśnij ENTER:");
		
		//Rzeczywiste pobranie danych
		String s = sc.next(); //pobiera String - jedno słowo do spacji
		
		System.out.println("Wpisałeś słowo: "+s);
		
	}
}

