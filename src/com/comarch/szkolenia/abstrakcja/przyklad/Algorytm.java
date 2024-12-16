package com.comarch.szkolenia.abstrakcja.przyklad;

public abstract class Algorytm {
    public void calculate() {
        wczytajDane();
        liczenie1();
        liczenie2();
        zapiszWyniki();
    }

    public abstract void wczytajDane();

    public void liczenie1() {
        System.out.println("licze !!");
    }

    public void liczenie2() {
        System.out.println("nadal licze");
    }

    public abstract void zapiszWyniki();
}
