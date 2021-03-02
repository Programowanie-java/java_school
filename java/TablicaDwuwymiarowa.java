

class TablicaDwuwymiarowa{
    public static void main(String [] args){
    
        tablicaTabliczkaMnozenia();

    }
    
    
    
    private static void tablicaTabliczkaMnozenia(){
        int [][] tab = new int[10][10];
        //Wypełnienie tablicy 
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                tab[i][j] = (i+1)*(j+1);
            }
        }
        System.out.println("Tabliczka mnożenia:\n");
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    
    
    private static void tablica2x2(){
        //Stwórz tablicę dwuwymiarową i przypisz do niej elementy 1,2,3,4
        //Wyświetl elementy tablicy jeden pod drugim
        int tab2x2 [][] = new int[2][2];
        tab2x2[0][0] = 1;
        tab2x2[0][1] = 2;
        tab2x2[1][0] = 3;
        tab2x2[1][1] = 4;
        for (int i=0;i<tab2x2.length;i++){
            for(int j=0;j<tab2x2[i].length;j++){
                System.out.println(tab2x2[i][j]);
            }
        }
        
    }
    
    //metoda pierwsza z tablicą dwuwymiarową
    private static void tab2dFirst(){
        int [][] tab2d = new int[5][2];
        //przypisywanie wartości do tablicy dwuwymiarowej
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        for (int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][j]);
            }
            System.out.println("Koniec pętli ze zmienną j");
        }
        System.out.println("Koniec pętli ze zmienną i");
    }
//commit: przeniesienie funkcjonalności do metody tab2dFirst
    
    private static void przypomnienieTablicJednowymiarowych(){
        int [] tab = new int[5];
        //przypisanie do pierwszego elementu tablicy [index = 0] wartości 40
        tab[0] = 40;
        //tak nie można bo -> error: incompatible types: String cannot be converted to int
        //tab[1] = "Jeden";
        //wyświetlenie elementów tablicy :
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }
//commit: przeniesienie do przypomnienieTablicJednowymiarowych 

}











