package com.company.libraryProject;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Catalogue implements Comparable<Catalogue> {
    private ArrayList<Book> bookDatabase = new ArrayList<Book>(); // kaupia  knygas maine
    public void addBook(Book book){
        bookDatabase.add(book);
    }

    public void removeBook(Book book) {
        bookDatabase.remove(book);
    }

    public ArrayList<Book> getBooksByAuthor (Author author) {
        return (ArrayList<Book>) bookDatabase.stream()
                .filter(book -> book.authors.contains(author))
                .collect(Collectors.<Book>toList());
    }

    public ArrayList<Book> getBooksByAuthor (String authorName) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book : this.bookDatabase) {
            for (Author bookAuthor : book.authors) {
                if(authorName.equals(bookAuthor.name)) {
                    filteredBooks.add(book);
                    break;
                }
            }
        }
        return filteredBooks;
    }

    @Override
    public int compareTo(Catalogue o) {
        return 0;
    }


}
