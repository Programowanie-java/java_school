import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


//TODO - naprawić działanie w ToDoUtils aby użytkownik wpisując literkę lub liczbę spoza listy 
// nie wykrzaczał programu


class Main{
	public static void main(String[] args){
		//(new Menu()).menu(); //Obiekt anonimowy - bez przypisania do zmiennej
		Scanner sc = new Scanner(System.in);
		String choose = "";
		while(!choose.equals("q")){
			Menu.menu();
			System.out.print(">>>> ");
			choose = sc.next();
			switch(choose.toLowerCase()){
				case "1": {
					ToDoUtils.showNotes();
					break;
				}
				case "2": {
					ToDoUtils.deleteNote();
					break;
				}
				case "3": {
					break;
				}
				case "4": {
					break;
				}
				case "q": {
					break;
				}
				default: {
					System.out.println("Nie ma takiej opcji! Wybierz coś innego");
				}
			}
		}
		
		
		
		//
	}
	
	//Testowanie formatu daty!
	private static void testingDateTimeFormatter(){
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
		LocalDateTime lDT1 = LocalDateTime.now();
		System.out.println(dTF.format(lDT1));
		//LocalDateTime lDT2 = LocalDateTime.parse("2021-04-26T09:30:42.826682289");
		//System.out.println(lDT2);
		dTF = DateTimeFormatter.ofPattern("YYYY LLLL dd");
		System.out.println(dTF.format(lDT1));
	}
	
	//Testowanie zapisu i odczytu  pliku
	private static void testSaveToFile(){
		FileUtils fu = new FileUtils();
		fu.saveToFile(new ToDo("Kończenie prac nad programem",
			"Koniec prac na działaniem programu już jest blisko"), true);
		fu.saveToFile(new ToDo("Do zrobienie MENU",
			"Zrobimy MENU w pętli aby można było wybierać, kasować, modyfikować nasze wpisy"),true);
		fu.readFromFile();
	}	
	
	//Testowanie poprawności pobierania danych z klawiatury
	private static void testReadFromKeyBoard(){
		ReadFromKeyboard rfk = new ReadFromKeyboard();
		ToDo td = rfk.readOneToDo();
		System.out.println(td);
	}
	
	//Testowanie poprawności napisania Obiektu ToDo
	private static void test(){
		ToDo td1 = new ToDo("Pierwsza",
		"To jest pierwsza notatka");
		ToDo td2 = new ToDo("Dwa","Druga notatka z autorem",
		"adams");
		System.out.println(td1);
		System.out.println(td2);
	}
} 
