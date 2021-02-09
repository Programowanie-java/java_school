import java.util.Scanner;

class Witaj{
	public static void main(String [] arg){
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj imię: ");
		String imie = sc.next();
		System.out.print("Witaj "+imie);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę: ");
		int l1 = sc.nextInt();
		System.out.print("Podaj drugą liczbę: ");
		int l2 = sc.nextInt();
		System.out.print("Podaj działanie matematyczne [+ - * /]: ");
		String dzialanie = sc.next();
		
		//if(dzialanie == "+") - tanie wolno porównywać Stringów
		
		if(dzialanie.equals("+")){
			System.out.print(""+l1+dzialanie+l2+"="+(l1+l2));
		} else if(dzialanie.equals("-")){
			System.out.print(""+l1+dzialanie+l2+"="+(l1-l2));
		} else if(dzialanie.equals("*")){
			System.out.print(""+l1+dzialanie+l2+"="+(l1*l2));
		} else if(dzialanie.equals("/") && l2 != 0){
			System.out.print(""+l1+dzialanie+l2+"="+((double)l1/l2));
		} else if(l2 == 0){
			System.out.print("Nie dziel przez zero");
		} else {
			System.out.print("Nieznane działanie");
		} 

	}
}
