import java.util.Random;

class Tablice1{
    public static void main(String[] args){
    /**
    Tablicę tworzymy jak ====znamy ilość elementów==== które chcemy przechować, różnych wartości
    Zastępuje ona tworzenie wielu zmiennych!!!
    Nieefektywny zapis:
        int l1,l2,l3,l4,l5,l6;
        int suma = l1+l2+l3+l4+l5+l6;
    */
        
        //stwórz tablicę zawierającą 5 elementów typu int - liczby całkowite
        //tablica jest pusta!!!
//         int [] tab1 = new int[6]; 
        //inny sposób
//         int tab2 [] = new int[6]; 
        //Z wypełnieniem
//         int tab3[] = {1,2,3,4,5,6};
        
        tablicaInt();
    }
    
    //Metoda z tablicą typu int
    private static void tablicaInt(){
        Random r = new Random();
        int [] tab1 = new int[6]; 
        //Wypełnianie tablicy danymi -> pętla FOR
        for (int i=0;i<tab1.length;i++){
            tab1[i] = r.nextInt(100);
        }
        //Wyświetlanie elementów tablicy -> pętla FOR
        for (int i=0;i<tab1.length;i++){
            System.out.println(i+" -> "+tab1[i]);
        }
    }
    
    private static void tablicaString(){
        //Tablica stringów - inaczej tekstu (dowolne znaki)
        String tab1[] = {"Anna","Janek","Paweł","Zenek","Paulina"};
        for(int i=0;i<tab1.length;i++){
            System.out.println(i+" -> "+tab1[i]);
        }
    }
    
    private static void tablicaError(){
        int [] tab1 = new int[6];
        for(int i = 0; i<=tab1.length;i++){ 
            System.out.println(tab1[i]); //błąd będzie bo tab1[6] nie istnieje
        }
    }
}
