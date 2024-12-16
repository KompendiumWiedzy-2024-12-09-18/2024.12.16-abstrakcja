package com.comarch.szkolenia.abstrakcja.przyklad;

public class AlgorytmDB extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje z bazy");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("zapisuje do bazy");
    }
}
