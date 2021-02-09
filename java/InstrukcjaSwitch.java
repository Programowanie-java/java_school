import java.util.Scanner;

class InstrukcjaSwitch{
	public static void main (String [] parametry_wejsciowe){
		dzienTygodnia();
	}
	
	//tworzenie metod/funkcji
	static void dzienTygodnia(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj numer dnia tygodnia [1 - Poniedziałek] : ");
		int dzien = sc.nextInt();
		switch(dzien){
			case 1:{
				System.out.println("Poniedziałek");
				break;
			}
			case 2:{
				System.out.println("Wtorek");
				break;
			}
			case 3:{
				System.out.println("Środa");
				break;
			}
			case 4:{
				System.out.println("Czwrtek");
				break;
			}
			case 5:{
				System.out.println("Piątek");
				break;
			}
			case 6:{
				System.out.println("Sobota");
				break;
			}
			case 7:{
				System.out.println("Niedziela");
				break;
			}
			default:{
				System.out.println("Nie ma takiego dnia tygodnia");
			}
		}
	}
	
}
