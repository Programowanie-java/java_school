import java.util.Scanner;

class ReadFromKeyboard{
	
	public ToDo readOneToDo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj tytuł: ");
		String title = sc.nextLine();
		System.out.println("Podaj treść notatki: ");
		String content = sc.nextLine();
		System.out.println("Podaj autora lub naciśnij ENTER: ");
		String author = sc.nextLine();
		
		if (author.length()<1){
			return new ToDo(title,content);
		} else {
			return new ToDo(title,content,author);
		}
	}
}
