import java.util.Scanner;

public class JavaPodstawy {
    public static void main(String [] arg){
        if(arg.length == 1){
            String temp = arg[0];
            if(temp.contains("+")){
                String[] tabTemp = temp.split("\\+");
                System.out.println(" = "+
                        (Double.parseDouble(tabTemp[0])+Double.parseDouble(tabTemp[1]))
                    );
            } else if(temp.contains("-")){
                String[] tabTemp = temp.split("-");
                System.out.println(" = "+
                        (Double.parseDouble(tabTemp[0])-Double.parseDouble(tabTemp[1]))
                    );
            } else if(temp.contains("*")){
                String[] tabTemp = temp.split("\\*");
                System.out.println(" = "+
                        (Double.parseDouble(tabTemp[0])*Double.parseDouble(tabTemp[1]))
                    );
            } else if(temp.contains("/")){
                String[] tabTemp = temp.split("/");
                System.out.println(" = "+
                        (Double.parseDouble(tabTemp[0])/Double.parseDouble(tabTemp[1]))
                    );
            } else if(temp.contains("%")){
                String[] tabTemp = temp.split("%");
                System.out.println(" = "+
                        (Double.parseDouble(tabTemp[0])%Double.parseDouble(tabTemp[1]))
                    );
            } else {
                help(1);
            }
        } else if(arg.length > 1){
            System.out.println("Za duża liczba parametrów uruchom bez parametrów celem poznania składni");
        } else {
            help(0);
        }
        
    }
    
    private static void help(int nr){
        String help = "";
        if(nr == 0){
            help = "Instrukcja obsługi programu:"+
                "\nWprowadź działanie w następujący sposób  \"2+3\"  i naciśnij ENTER"+
                "\nDostępne działania: +, -, /, *, % - reszta z dzielenia";
        } else if(nr == 1){
            help = "Nieobsługiwane działanie:"+
                "\nDostępne działania: \n+, \n-, \n/, \n*, \n% - reszta z dzielenia";
        }
        
        System.out.println(help);
    }
    
    
    
    
    private static void getName(){
        System.out.print("Podaj imię: ");
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.next(); //pobierz jeden wyraz
        System.out.println("Witaj "+wyraz.toUpperCase());
    }
    
    private static void getAge(){
        System.out.print("Podaj wiek: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); //pobierz jeden wyraz
        System.out.println("Masz "+age);
    }
    
}
