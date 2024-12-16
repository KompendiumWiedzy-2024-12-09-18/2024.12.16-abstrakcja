package com.comarch.szkolenia.abstrakcja.przyklad;

public class AlgorymtInternetowy extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje z internetu");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("Zapisuje do bazy");
    }
}
