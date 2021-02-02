import java.util.Scanner;

class DzialaniaMatematyczne{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        String wybor = "";
        while(!wybor.equals("quit")){
            menu();
            wybor = sc.next();
            wybor(wybor);
        }
    }
    
    private static void wybor(String wybor){
        switch(wybor){
            case "1":{
                potegowanie();
                break;
            }
            case "2":{
                poleTrojkataRownobocznego();
                break;
            }
            default:
                defaultText();
        }
    }
    //Text który pojawia się jak nie wybiorę dostępnej opcji
    private static void defaultText(){
        System.out.println("Nie ma takiej opcji");
    }
    /*
        Menu aplikacji
    */
    private static void menu(){
        System.out.println("Pomocnik młodego matematyka");
        System.out.println("1 - Potęgowanie dwóch liczb");
        System.out.println("2 - Obliczanie pola trójkąta rónobocznego przy znanym boku");
        System.out.println("quit - Zakończenie programu");
        System.out.print("Wybierz opcję wpisując odpowiednią komendę: ");
    }
    
    private static void potegowanie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        float podstawa = sc.nextFloat();
        System.out.print("Podaj potęgę do której chesz podnieść "+podstawa+"^");
        float wykladnik = sc.nextFloat();
        System.out.println(""+podstawa+"^"+wykladnik+" = "+Math.pow(podstawa,wykladnik));
    }
    
    private static void poleTrojkataRownobocznego(){
        //(a^2 * pier(3)) / 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj bok tórjkąta: ");
        float bok = sc.nextFloat();
        System.out.println("Pole trójkąta o boku "+bok+" = "+(bok*bok*Math.sqrt(3)/4));
    }
    
}
