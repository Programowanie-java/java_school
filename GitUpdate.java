
import java.util.Scanner;

public class TrzeciProgram {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wpisz zdanie i naciśnij ENTER");
		String zdanie = sc.nextLine();
		String[] tab = zdanie.split(" ");
		//System.out.println("Wyrazy: "+tab.length);
		
		for(int i=0;i<tab.length;i++){
			System.out.println("Wyraz: "+tab[i]+" o indexie: "+i);
		}
		
		
		
	}
}









