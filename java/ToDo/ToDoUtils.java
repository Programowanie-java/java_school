import java.util.ArrayList;
import java.util.Scanner;

class ToDoUtils{
	//poniższa metoda będzie wywoływana bez stworzenia obiektu ToDoUtils
	public static void showNotes(){
		ArrayList<ToDo> list = showAction("wyświetlenia");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		if(choose != 0){
			System.out.print(list.get(choose-1));
		}
	}
	
	//poniższa metoda będzie wywoływana bez stworzenia obiektu ToDoUtils
	public static void deleteNote(){
		ArrayList<ToDo> list = showAction("skasowania");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		if(choose !=0){
			FileUtils fu = new FileUtils();
			ToDo note = list.get(choose-1);
			list.remove(choose-1);
			fu.deleteOldNotesAndSaveNewNotes(list);
			System.out.print("Notatka:\n"+note+"\nzostała usunięta\n");
		}
	}
	
	private static ArrayList<ToDo> showAction(String action){
		FileUtils fu = new FileUtils();
		ArrayList<ToDo> list = fu.readFromFile();
		System.out.println("Wybierz notatke do "+action+":");
		System.out.print("0 Powrót do MENU\n");
		for (int i=0;i<list.size();i++){
			System.out.println((i+1)+" "+ list.get(i).getTitle() );
		}
		System.out.print(">>> ");
		return list;
	}
}
