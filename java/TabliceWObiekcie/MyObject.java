import java.util.Random;

class MyObject{
	private int tab[]; //Przygotowanie zmiennej
	
	//Konstruktor choose_number_type - 0 numbers, 1 - odd numbers  2 - even numbers
	public MyObject(int length_of_table,int choose_number_type){
		tab = new int[length_of_table];
		switch(choose_number_type){
			case 0: fillTab(); break;
			case 1: fillTabWithOdd(); break;
			case 2: fillTabWithEven(); break;
		}
		
	}
	//Metoda wypełniająca tablicę dowolną liczbą
	private void fillTab(){
		Random r = new Random();
		for (int i=0; i<tab.length;i++){
			tab[i] = r.nextInt(1000);
		}
	}
	
	private void fillTabWithOdd(){
		Random r = new Random();
		for (int i=0; i<tab.length;i++){
			int nr = r.nextInt(1000);
			if (nr % 2 != 0)
				tab[i] = nr;
			else
				tab[i] = nr+1;
		}
	}
	
	private void fillTabWithEven(){
		Random r = new Random();
		for (int i=0; i<tab.length;i++){
			int nr = r.nextInt(1000);
			if (nr % 2 == 0)
				tab[i] = nr;
			else
				tab[i] = nr+1;
		}
	}
	
	public int[] getTab(){
		return tab;
	}
	
	@Override
	public String toString(){
		return "Array has length: "+tab.length;
	}
	
} 
