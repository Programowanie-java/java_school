import java.util.Random;
class CzasWykonaniaProgramu{
	public static void main(String [] a){
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
	}
}
