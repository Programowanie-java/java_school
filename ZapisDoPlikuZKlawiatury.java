import java.util.Scanner;
import java.io.*; //* - wszystkie clasy/biblioteki z java.io

class ZapisDoPlikuZKlawiatury{
	public static void main(String [] a){
		File f = new File("dane.txt");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String temp = "";
		while(!temp.equals("exit")){
            temp = sc.nextLine();
            if(!temp.equals("exit")){
                s = s+"\n"+temp;
            }
		}
		try{
			FileWriter fw = new FileWriter(f);
			fw.write(s);
			fw.close();
		} catch(IOException e){
			System.out.println("BŁĄD: "+e.toString());
		}
	}
}
