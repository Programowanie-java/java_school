import java.util.ArrayList;

class ArrayListvsTable {
	//Metoda publiczna
    public static void arrayListvsTable(){
        int[] t = new int[10];
        //Do ArrayList można wpisywać tylko OBIEKTY!!!
        //int - oznacza TYP ZMIENNEJ
        //ArrayList<int> lista = new ArrayList<>();  BŁĄÐ
        ArrayList<Integer> lista = new ArrayList();
        //Zapełnienie tablicy liczbami od 10 do 19
        for (int i=0;i<10;i++){
            t[i] = i+10;
        }
        System.out.println(t);//WYNIK: jakiś adres który ma ta tablica w pamięci

        //Dodanie do listy elementy - liczby od 10 do 19
        for (int i=0;i<10;i++){
            lista.add(i+10);
            // 10;11;12;13;14;15;16;17;18;19
        }
        System.out.println(lista);//WYNIK: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
        lista.add(100);
        for (int i=0;i<lista.size();i++){
            System.out.println("lista["+i+"] = "+lista.get(i));
        }
    }
}
