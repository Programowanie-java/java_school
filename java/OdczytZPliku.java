import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
 
class OdczytZPliku{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(new File("odczytzpliku.txt"));
            //Wszystkie dane odczyta z pliku to String
            while(sc.hasNext()){
                //int i = sc.nextLine(); //error incompatible type
                //Konwertowanie na int
                int i = Integer.parseInt(sc.nextLine());
                System.out.println(i);
            }
        }catch (FileNotFoundException ex){
            System.out.println("ERROR -> "+ex.toString());
        }
        
    }
}
