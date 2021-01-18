

public class Drugi {
	
	public static void main (String[] args) {
		Test t = new Test();
		System.out.println("t.i = "+t.i);
		t.i = t.i+100;
		System.out.println("t.i = "+t.i);
		
		t.test();
		t.napis("TO się wyświetli");
	}
}


class Test{
	String str = "Dowlony napis 123 45+90"; //dowolny ciąg znaków
	int i = 100; 		//dowolna liczba
	boolean b = true; 	//false
	
	void test(){
		System.out.println("str = "+str+"\ni = "+i+"\nb = "+b);
	}
	
	void napis(String s){
		System.out.println("TO POBRAŁEM:  "+s);
	}
}

