package org.example.composite;

public class Main {
    public static void main(String[] args) {
        Page page = new Page();
        Page page2 = new Page();
        Page page3 = new Page();
        Page page4 = new Page();
        Page page5 = new Page();

        Section section = new Section("Premessa");
        section.getPages().add(page);
        section.getPages().add(page2);

        Section section2 = new Section("Capitolo 1");
        section2.getPages().add(page3);
        section2.getPages().add(page4);

        Section section3 = new Section("Capitolo 2");
        section3.getPages().add(page5);

        Book book = new Book("Design Patterns");
        book.getSections().add(section);
        book.getSections().add(section2);
        book.getSections().add(section3);

        book.stampa();




    }
}
