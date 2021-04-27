import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main{
	public static void main(String[] args){
		//testSaveToFile();
		testingDateTimeFormatter();
	}
	
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
		fu.saveToFile(new ToDo("Drugi wpis",
			"Drugi wiersz???"));
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
