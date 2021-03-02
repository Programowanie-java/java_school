import java.util.Scanner;
import java.io.*; //* - wszystkie clasy/biblioteki z java.io

class DopisywanieDanychDoPliku{
	public static void main(String [] args){
        //Stworzenie dowiązania do pliku
		File f = new File("dopisywanie.txt");
		int a = 10;
        String doPliku = "Pole kwadratu o boku "+a+" = "+(a*a);
        
		//Dopisywanie do pliku f (utworzony wyżej) komentda (dodano true):  FileWriter(f,true)
		try{
			FileWriter fw = new FileWriter(f,true);
			fw.write(doPliku+"\n");//Dopisanie do pliku i przejście do nowego wiersza
			fw.close();
		} catch(IOException e){
			System.out.println("BŁĄD: "+e.toString());
		}
	}
}
