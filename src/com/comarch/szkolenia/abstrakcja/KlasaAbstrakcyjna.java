package com.comarch.szkolenia.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    private int x;
    private String s;

    public KlasaAbstrakcyjna(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public void metoda() {
        System.out.println("metoda");
    }

    public abstract void metodaAbstrakcyjna();
}
