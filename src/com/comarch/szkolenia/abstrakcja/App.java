package com.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        UserRepositoryInterface klasaKolegi = new DummyImpl();
        String s = klasaKolegi.loadUser();
        //
        //
        //
        //

        String s2 = klasaKolegi.loadUserById(34);
        //?
        //??
        //??

        klasaKolegi.updateUser("User");

        klasaKolegi.saveUser("User2");

        System.out.println(Constants.PI);
        System.out.println(Constants.STALA_1);

        KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaDziedziczacaPoAbstrakcyjnej(5, "abc");
        klasaAbstrakcyjna.metoda();
        klasaAbstrakcyjna.metodaAbstrakcyjna();
    }
}
