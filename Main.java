package com.company.libraryProject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Author nabokov = new Author("Nabokov, Vladimir");
            Author spyri = new Author("Spyri,Johanna");
            Author marquez = new Author("Márquez, Gabriel García Márquez");
            Author wallace = new Author("Wallace, Lew");
            Author waller = new Author("Waller, Robert James");
            Author Coelho = new Author("Coelho, Paulo");
            Author jkrowling = new Author("Rowling, J. K. ");
            Author danBrown = new Author("Brown, Dan");
            Author Collodi = new Author("Collodi, Carlo");
            Author Carle = new Author("Carle, Eric");
            Author Huxley = new Author("Huxley, Aldous");

            Catalogue catalogue = new Catalogue();

            catalogue.addBook(new Book("Lolita", nabokov, "Classic", 1955));
            catalogue.addBook(new Book("Heidi", spyri, "Children's literature", 1880));
            catalogue.addBook(new Book("One Hundred Years of Solitude", marquez, "Realism", 1967));
            catalogue.addBook(new Book("Ben-Hur: A Tale of the Christ", wallace, "Historical fiction", 1880));
            catalogue.addBook(new Book("The Bridges of Madison County", waller, "Romance", 1992));
            catalogue.addBook(new Book("The Alchemist", Coelho, "Fantasy", 1988));
            catalogue.addBook(new Book("Harry Potter and the Deathly Hallows", jkrowling, "Fantasy", 2007));
            catalogue.addBook(new Book("The Da Vinci Code", danBrown, "Mystery thriller", 2003));
            catalogue.addBook(new Book("The Adventures of Pinocchio", Collodi, "Children's literature", 1881));
            catalogue.addBook(new Book("The Very Hungry Caterpillar", Carle, "Children's literature", 1969));
            catalogue.addBook(new Book("The Pilgrimage", Coelho, "Fantasy", 1987));
            catalogue.addBook(new Book("Brida", Coelho, "Fantasy", 1990));
            catalogue.addBook(new Book("Super", Huxley, "Fantasy", 1990));

            //System.out.println(catalogue.getBooksByAuthorFromFile(Huxley));
            //file scanner which splits data from file "bookslist.txt" for new arraylist
            File fileBook = new File("bookslist.txt");
            Scanner scan = new Scanner(fileBook);
//            ArrayList<Book> fileCatalogue = new ArrayList<>();
            Catalogue myCatalogue = new Catalogue();

            while (scan.hasNextLine()) {
                String fullTitle = scan.nextLine();
                int commaSpace = fullTitle.indexOf("; ");

                String bookTitle = fullTitle.substring(0, commaSpace);
                String authorGenreYear = (fullTitle.substring(commaSpace + 2));
                int commaSpace2 = authorGenreYear.indexOf("; ");

                Author fileAuthor = new Author(authorGenreYear.substring(0, commaSpace2));
                String GenreYear = (authorGenreYear.substring(commaSpace2 + 2));

                int commaSpace3 = GenreYear.indexOf("; ");
                String genre = GenreYear.substring(0, commaSpace3 + 2);

                String Year = (GenreYear.substring(commaSpace3 + 2));

                Book book = new Book(bookTitle, fileAuthor, genre, Integer.parseInt(Year));

                myCatalogue.addBook(book);

            }


//            ArrayList<Book> pablosBooks = myCatalogue.getBooksByAuthor(Coelho.name);
//            System.out.println(pablosBooks);
            ArrayList<Book> huxleyBooks = myCatalogue.getBooksByAuthor(Huxley.name);
            System.out.println(huxleyBooks);









        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Oh no, something went just wrong!");
        }
    }
}