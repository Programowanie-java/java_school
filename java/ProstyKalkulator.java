import java.util.Scanner;
class ProstyKalkulator {
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Prosty kalkulator");
		System.out.print("Podaj pierwszą liczbę: ");
		float n1 = sc.nextFloat();
		System.out.print("Podaj drugą liczbę: ");
		float n2 = sc.nextFloat();
		System.out.print("Podaj działanie [+  -  *  /]: ");
		String operation = sc.next();
		if(operation.equals("+")){
			System.out.println(n1+" "+operation+" "+n2+" = "+(n1+n2));
		} else if(operation.equals("-")){
			System.out.println(n1+" "+operation+" "+n2+" = "+(n1-n2));
		} else if(operation.equals("*")){
			System.out.println(n1+" "+operation+" "+n2+" = "+(n1*n2));
		} else if(operation.equals("/")){
			System.out.println(n1+" "+operation+" "+n2+" = "+(n1/n2));
		} else {
			System.out.println("\""+operation+"\" nobsługiwane działanie");
		}
	}
}
