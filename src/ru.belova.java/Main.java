package ru.belova.java;

public class Main {
    public static void main(String[] args) {
        Publishing Prospekt = new Publishing("Проспект", "Москва");
        Publishing Piter = new Publishing("Питер", "Санкт-Петербург");
        Publishing BXW = new Publishing("БХВ", "Санкт-Петебург");
        Publishing Dialectika = new Publishing("Диалектика", "Киев");

        String[] authors1 = new String[]{"Седжвик Роберт", "Уэйн Кевин"};

        Book[] books = new Book[5];
        books[0] = new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", authors1, 2018, Piter);
        books[1] = new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, BXW);
        books[2] = new Book("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, Dialectika);
        books[3] = new Book("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, BXW);
        books[4] = new Book("Конституция РФ", 2020, Prospekt);

        Book.printAll(books);
        System.out.println("- - - - - - - - " );
        Book.correctPrint(books);// в условии записано, что если Publishing "БХВ", то город Санкт-Петербург
    }
}







