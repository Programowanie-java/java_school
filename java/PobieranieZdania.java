
import java.util.Scanner;

public class PobieranieZdania {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wpisz dowolne zdanie i naciśnij ENTER");
		String zdanie = sc.nextLine(); // nextLine() - całe zdanie 
		int iloscZnakowZdania = zdanie.length();
		System.out.println("Twoje zdanie ma "+iloscZnakowZdania+" znaków");
	}
}

