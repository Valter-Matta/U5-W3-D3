package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements BookItem {
    private String title;
    List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Section(String title) {
        this.title = title;
    }

    @Override
    public int getNumberOfPages() {
        return pages.stream().mapToInt(Page::getNumberOfPages).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Section: " + title);
        pages.forEach(Page::stampa);
    }
}
