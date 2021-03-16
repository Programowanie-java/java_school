class PierwszyObiekt {
    public static void main (String [] args){
        //Zdefniownanie  i  stworzenie obiektu
        ObiektPudelko op = new ObiektPudelko();
        System.out.println("Domyślna wartość: "+op.wysokosc);
        
        op.wysokosc = 100;
        System.out.println("Po zmodyfikowaniu "+op.wysokosc);
        
        Osoba os = new Osoba();
        System.out.println(os.imie);
        System.out.println(os.nazwisko);
    }

}

