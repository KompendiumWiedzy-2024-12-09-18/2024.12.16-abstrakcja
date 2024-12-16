package com.comarch.szkolenia.abstrakcja.przyklad;

public class App {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmPlikowy();
        algorytm.calculate();

        Algorytm algorytmDb = new AlgorytmDB();
        algorytmDb.calculate();

        Algorytm algorytmInternet = new AlgorymtInternetowy();
        algorytmInternet.calculate();
    }
}
