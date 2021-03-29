
class Main{
	public static void main(String[] args){
		MyObject mo = new MyObject(100,0);
		
		int tab[] = mo.getTab(); //pobierz z obiekty mo tablicę i przypisz do zmiennej tab
		for (int i = 0;i<tab.length;i++){
			System.out.println(tab[i]);
		}
		
	}
} 
