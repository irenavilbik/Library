package com.company.libraryProject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book {
    public boolean contains; // istrinti
    String bookTitle;
    List<Author> authors;
    String genre;
    int yearOfIssue;
    boolean isAvailable=true;


    public Book(String bookTitle, List<Author> authors, String genre, int yearOfIssue) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.genre = genre;
        this.yearOfIssue=yearOfIssue;

    }
    public Book(String bookTitle, Author author, String genre, int yearOfIssue) {
        this.bookTitle = bookTitle;
        this.authors = new ArrayList<>(Arrays.asList(author));
        this.genre = genre;
        this.yearOfIssue=yearOfIssue;

    }
    public Book(String bookTitle, String genre, int yearOfIssue) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.yearOfIssue=yearOfIssue;

    }
    public String getBookTitle() {
        return bookTitle;
    }

    public List<Author> getAuthors() {
        return this.authors;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }


    public void makeBorrowed(){
        isAvailable = false;
    }
    public void makeReturned(){
        isAvailable = true;
    }
    public boolean getAvailability() {
        return isAvailable;
    }
    public String toString() {
        return this.authors + ", " + this.bookTitle + ", genre " + this.genre + ", issued " + this.yearOfIssue;

    }
    public String toStringList(){
        return bookTitle + ", "  + genre + ", " + yearOfIssue;
    }



}


