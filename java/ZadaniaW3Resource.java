import java.util.Scanner;

class ZadaniaW3Resource {
	public static void main(String[] arg){
		System.out.println("===========1=========");
		System.out.println("Hello");
		System.out.println("Adam");
		System.out.println("\n===========2=========");
		System.out.println(74+36);
		System.out.println("\n===========3=========");
		System.out.println(50/3);
		System.out.println("\n===========4=========");
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + (-3)*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		System.out.println("\n===========5=========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number:");
		int first = sc.nextInt();
		System.out.print("Input second number:");
		int second = sc.nextInt();
		System.out.print(first+" x "+second+" = "+first*second);
	}
}
