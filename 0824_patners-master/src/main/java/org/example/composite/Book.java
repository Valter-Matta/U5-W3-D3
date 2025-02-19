package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookItem {
    private String title;
    private List<Section>   sections = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public int getNumberOfPages() {
        return sections.stream().mapToInt(Section::getNumberOfPages).sum();
    }


    public void stampa() {
        System.out.println("Book: " + title);
        sections.forEach(Section::stampa);
    }
}
