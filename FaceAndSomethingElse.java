import java.util.Scanner;

class FaceAndSomethingElse {
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj pierwszą liczbę binarną: ");
		String first = sc.next();
		System.out.print("Podaj drugą liczbę binarną: ");
		String second = sc.next();
		//zamiana Stringa z binarnej na dziesiętną
		int b1 = Integer.parseInt(first, 2); 
		int b2 = Integer.parseInt(second, 2);
		
		System.out.println("Podano liczbę "+first+" Int = "+b1);
		System.out.println("Podano liczbę "+second+" Int = "+b2);
		
		int sum = b1+b2;
		System.out.println("Int = "+sum+"  binary = "+Integer.toBinaryString(sum));
	}
}
