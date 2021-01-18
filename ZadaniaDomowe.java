import java.io.*; //* - wszystkie klasy/biblioteki

class ZadaniaDomowe{
	public static void main(String[] a){
		File f =  new File("mojeliczby.txt");//tworzenie pliku tekstowego
			try{
			FileWriter fw = new FileWriter(f);
				for (int i = 0; i < 101; i++){
					if(i%2 == 0){ //jezeli reszta z dzielenia rowna sie 0
						fw.write(i+"\n");
					}
				}
			fw.close();
			} catch(IOException e){
				System.out.println("BŁĄD: "+e.toString());
			}
	}
} 
