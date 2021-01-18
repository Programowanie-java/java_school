

public class Pierwszy {
	
	public static void main (String[] args) {
		
		System.out.println("WITAJCIE");
		
		int x = 1;
		
		System.out.println("x = "+x);
		
		MojObiekt mo = new MojObiekt();
		
		System.out.println("mo = "+mo.str);
	}
}

class MojObiekt{
	int x = 90;
	String str = "To nie jest lekcja dla słabych!!!";
}
