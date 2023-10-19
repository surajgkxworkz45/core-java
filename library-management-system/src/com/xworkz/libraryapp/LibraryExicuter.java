package com.xworkz.libraryapp;

import com.xworkz.libraryapp.books.Books;
import com.xworkz.libraryapp.library.Library;

public class LibraryExicuter {


    public static void main(String[] args) {

        Library library =new Library();
        library.setBookId(1);
        library.setBookName("To Kill a Mockingbird");
        library.setBookAuthorName("Harper Lee");
        library.setPublisher("J. B. Lippincott & Co.");
        library.setCountryName("United States");
        library.setReleasedDate("July 11, 1960");
        library.setNoPages(281);


        Library library1 =new Library();
        library1.setBookId(2);
        library1.setBookName("Nineteen Eighty-Four");
        library1.setBookAuthorName("George Orwell");
        library1.setPublisher("Secker & Warburg");
        library1.setCountryName("United Kingdom");
        library1.setReleasedDate("8 June 1949");
        library1.setNoPages(328);


        Library library2 =new Library();
        library2.setBookId(3);
        library2.setBookName("Pride and Prejudice");
        library2.setBookAuthorName("Jane Austen");
        library2.setPublisher("T. Egerton, Whitehall");
        library2.setCountryName("United Kingdom");
        library2.setReleasedDate("28 January 1813");
        library2.setNoPages(356);

        Library library3 =new Library();
        library3.setBookId(4);
        library3.setBookName("Animal Farm");
        library3.setBookAuthorName("Toni Morrison");
        library3.setPublisher("Alfred A. Knopf Inc.");
        library3.setCountryName("United States");
        library3.setReleasedDate("September 1987");
        library3.setNoPages(324);

        Books boo =new Books();
        boo.getaddallbooks(library);
        boo.getaddallbooks(library1);
        boo.getaddallbooks(library2);
        boo.getaddallbooks(library3);

        boo.updateLibraryBookNameByAuthor("the night at the dark","the night at the dark");
        boo.updateLibraryBookAuthorandBookIdandBookPageandBookPublisherbyBookName("Nineteen Eighty-Four","Surya",02,398,
                "Nithis","18-5-2022");
        boo.deleteLibraryBookbybookId(4);
        boo.getAllNewLibrearyBookInfo();



/*
        String author=boo.getLibraryBookNamebyAutor("Harper Lee");
        System.out.println(author);

        String authore=boo.getLibraryBookAuthorbyName("Pride and Prejudice");
        System.out.println(authore);

        int auther=boo.getLibraryBookIdbyBookPages(324);
        System.out.println(auther);

        String authoreo=boo.getLibraryBookPublisherbyId(4);
        System.out.println(authoreo);
        System.out.println("...............................");


        Library auto=boo.getLibraryBookInfobyBookName("Animal Farm");
        System.out.println(auto.getBookId());
        System.out.println(auto.getBookName());
        System.out.println(auto.getBookAuthorName());
        System.out.println(auto.getPublisher());
        System.out.println(auto.getCountryName());
        System.out.println(auto.getReleasedDate());
        System.out.println(auto.getNoPages());




 */


    }
}
