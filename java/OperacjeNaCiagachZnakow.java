import java.util.Scanner;
import java.util.Random;

class OperacjeNaCiagachZnakow {
	public static void main(String [] arg){
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Wpisz dowolne zdanie:");
		//String str = sc.nextLine(); //sc.next() - pobierz wyraz	sc.nextInt() - liczba
		//System.out.println(""+str.length());
		System.out.println("==================1==============\n");
		for(int i=1;i<=20;i++){
			System.out.print(i+" ");
		}
		System.out.println("\n\n==================2==============\n");
		for(int i=1;i<=100;i++){
			System.out.print(i+" ");
			if(i % 10 == 0){
				System.out.println("");
			}
		}
		System.out.println("\n\n==================3==============\n");
		System.out.println("Podaj liczbę a wyświetlę dla niej tabliczkę mnożenia");
		int liczba = 0;
		/*liczba = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(liczba+" * "+i+" = "+(liczba*i));
		}*/
		System.out.println("\n\n==================4==============\n");
		System.out.println("Losuję liczby aż trafię na podaną z klawiatury");
		int maksymalna = 1000000;
		System.out.println("Podaj liczbę z zakresu 1 - "+maksymalna+"");
		Random rand = new Random();
		//rand.nextInt(20) - losuje od 0 do 19
		//rand.nextInt(200) - losuje od 0 do 199
		//liczba = sc.nextInt();
		int los = rand.nextInt(maksymalna)+1;
		long millisActualTime = System.currentTimeMillis();
		for(int i =0;i<maksymalna;i++){
			los = rand.nextInt(maksymalna)+1;
			//System.out.println(los);
		}
		long executionTime = (System.currentTimeMillis() - millisActualTime);
		System.out.println("Czas wykonania: "+executionTime+"ms");
		System.out.println("\n\n==================5==============\n");
		maksymalna = 49;
		int [] tab = new int[maksymalna];//Tablica 49 elementów
		for(int i=1;i<=49;i++){
			tab[i-1] = i; //tab[0] - pierwszy element
		}
		System.out.println("Zagraj w dużego lotka");
		for(int i=0;i<6;i++){
			los = rand.nextInt(maksymalna);
			System.out.println((i+1)+" -> "+ tab[los]+" ");
			tab[los] = tab[maksymalna-1];
			maksymalna--;
		}
		System.out.println("\n\n==================6==============\n");
		System.out.println("Zagraj w Multi Lotka 20 z 80");
		maksymalna = 80;
		tab = new int[maksymalna];//Tablica 49 elementów
		for(int i=1;i<=maksymalna;i++){
			tab[i-1] = i; //tab[0] - pierwszy element
		}
		for(int i=0;i<20;i++){
			los = rand.nextInt(maksymalna);
			System.out.println((i+1)+" -> "+ tab[los]+" ");
			tab[los] = tab[maksymalna-1];
			maksymalna--;
		}
		
	}
}
