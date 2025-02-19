package org.example.composite;

public class Page implements BookItem {

    public Page() {

    }

    @Override
    public int getNumberOfPages() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Page");
    }
}
