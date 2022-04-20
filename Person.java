package com.company.libraryProject;

import java.util.ArrayList;

abstract class Person implements Cloneable {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    public String toString() {
        return name;
    }
}


class Reader extends Person {
    ArrayList<Book> readBooks = new ArrayList<Book>();
    ArrayList<Book> currentBooks = new ArrayList<Book>();

    public Reader(String name) {
        super(name);

    }

    public ArrayList<Book> getReadBooks() {
        return readBooks;
    }

    public ArrayList<Book> getCurrentBooks() {
        return currentBooks;
    }

    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

class Author extends Person {
    ArrayList<Book> writtenBookList = new ArrayList<Book>();

    public Author(String name) {
        super(name);

    }


    public ArrayList<Book> getWrittenBookList() {
        return writtenBookList;
    }

    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}

