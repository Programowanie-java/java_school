
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class FunkcjeAndList{

    static final int MAX = 5000000; // stała globalnie dostępna
    
    static int [] tab = new int[MAX]; //tablica 5-elementowa globalnie dostęna w całej klasie FunkcjeAndList
    static List<Integer> list = new ArrayList<>(); //Stworzenie nowej listy
    
    public static void main(String arg[]){
        long start = System.nanoTime(); //pobiera aktualny czas systemowy w nanosekundach od ??? 1970-01-01 00:00:00 ???
        saveToTable();                  //nano - jedna miliardowa   czyli   1/1000 000 000
        long stop = System.nanoTime();
        //showTableElements();
        System.out.println("Zapis do TABLICY "+MAX+" losowych elementów trwał: "+(stop-start)+" nanosekund"+
                            " czyli "+( (double) (stop-start)/1000000000 )+" sekund");
        start = System.nanoTime();
        saveToList();
        stop = System.nanoTime();
        System.out.println("Zapis do LISTY "+MAX+" losowych elementów trwał: "+(stop-start)+" nanosekund"+
                            " czyli "+( (double) (stop-start)/1000000000 )+" sekund");
        //showListElements();
    }
    
    private static void saveToTable(){
        Random r = new Random();
        for(int i=0;i<MAX;i++){
            tab[i] = r.nextInt(100)+1; //Do tab[i] przypisz losową liczbę z zakresu 1 - 100
        }
    }
    
    private static void showTableElements(){
        for(int i=0;i<MAX;i++){
            System.out.print(tab[i]+" ");  //wyświetl elementy tablicy tab jeden obok drugiego odzielone spacją
        }
        System.out.println();
    }
    
    private static void saveToList(){
        Random r = new Random();
        for(int i=0;i<MAX;i++){
            list.add(r.nextInt(100)+1);
        }
    }
    /*
    To wszystko
    to jest
    komentarz    
    */
    private static void showListElements(){
        for(int i=0;i<MAX;i++){
            System.out.print(list.get(i)+" ");  //wyświetl elementy tablicy tab jeden obok drugiego odzielone spacją
        }
        System.out.println();
    }
    
}
