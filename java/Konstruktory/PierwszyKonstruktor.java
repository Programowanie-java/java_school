
import java.util.Scanner;
import java.util.InputMismatchException;

class PierwszyKonstruktor{
	public static void main(String[] args){
		//obliczanieBmi();
		
		ImieNazwisko in = new ImieNazwisko("Adam","Stelmaszyk");
		System.out.println(in);
	}
	
	private static void testowanie(){
		/*
		MojeBmi mb = new MojeBmi();
		mb.wzrost = 160;
		mb.waga = 80;
		*/
		
		//Zmiana atrybutów obiektu poprzez konstruktor
		MojeBmi mb = new MojeBmi(190,86);
		//ImieNazwisko im = new ImieNazwisko("Adam","Stelmaszyk");
		double wynik = mb.mojeBmi();
		System.out.println("BMI = "+wynik);
		//im.witaj();
		//System.out.println("Pola w obiekcie: "+mb.wzrost+"  "+mb.waga);
		
		
		mb.setWaga(65);
		mb.setWzrost(178);
		System.out.println("BMI = "+mb.mojeBmi());
	}
	
	
	private static void obliczanieBmi(){
		int wzrost = 0;
		int waga = 0;
		//Przygotowanie na wprowadzanie danych z klawiatury
		
		
		int zakoncz = 0;
		boolean flag = true;
		while(flag){
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n"
							+"0 - zakończ\n"
							+"1 - oblicz");
				zakoncz = sc.nextInt();
				while(zakoncz != 0){
					//Wprowadzamy z klawiatury wzrost:
					System.out.print("Podaj wzrost w cm: ");
					wzrost = sc.nextInt();
					//Wprowadzamy z klawiatury wagi:
					System.out.print("Podaj wagę w kg: ");
					waga = sc.nextInt();
					MojeBmi mb = new MojeBmi(wzrost,waga);
					System.out.println("BMI = "+mb.mojeBmi());
					System.out.print("0 - zakończ\nDowolna inna cyfra oblicz ponownie");
					zakoncz = sc.nextInt();
				}
				flag = false;
			} catch(InputMismatchException ex){
				System.out.println("Wpisuj tylko LICZBY CAŁKOWITE");
				zakoncz = 0;
			}
		}
		
		
	}
	
	
} 
