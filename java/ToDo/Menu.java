
class Menu{
	//static aby można było w innej klasie napisać tylko: Menu.menu()
	public static void menu(){
		String menu = "MENU\n"+
			"1. Pokaż notatki\n"+
			"2. Usun notatkę\n"+
			"3. Dodaj notatkę\n"+
			"4. Zmodyfikuj notatkę\n"+
			"q. Zakończ program";
		
		System.out.println(menu);
	}
}
