package com.comarch.szkolenia.abstrakcja.przyklad;

public class AlgorytmPlikowy extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje z pliku");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("Zapisuje do pliku");
    }
}
