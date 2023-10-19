package com.xworkz.libraryapp.books;

import com.xworkz.libraryapp.library.Library;

import java.util.Arrays;

public class Books {


    Library library[] = new Library[4];

    int index = 0;

    public boolean getaddallbooks(Library library) {
        boolean isbookadded = false;

        if (library != null) {
            this.library[index++] = library;
            System.out.println("all the books are added");
            isbookadded = true;
        }
        return isbookadded;
    }

    public void getReadAllBooks() {
        for (int index = 0; index < library.length; index++) {

            System.out.println(library[index].getBookId());
            System.out.println(library[index].getBookName());
            System.out.println(library[index].getBookAuthorName());
            System.out.println(library[index].getPublisher());
            System.out.println(library[index].getReleasedDate());
            System.out.println(library[index].getCountryName());
            System.out.println(library[index].getNoPages());
            System.out.println("........................................");
        }

    }


    public String getLibraryBookNameByAutor(String bookAuthor) {
        String bookName = null;

        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookAuthorName() == bookAuthor) {
                bookName = library[index].getBookName();

            }
        }

        return bookName;
    }

    public String getLibraryBookAuthorByName(String bookName) {
        String bookauthor = null;

        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookName() == bookName) {
                bookauthor = library[index].getBookAuthorName();

            }
        }

        return bookauthor;
    }

    public int getLibraryBookIdByBookPages(int bookPages) {
        int bookId = 0;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getNoPages() == bookPages) {
                bookId = library[index].getBookId();

            }
        }
        return bookId;
    }

    public String getLibraryBookPublisherById(int bookId) {
        String bookPublisher = null;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookId() == bookId) {
                bookPublisher = library[index].getPublisher();
            }
        }
        return bookPublisher;
    }

    public Library getLibraryBookInfoByBookName(String bookName) {
        Library libreayInfo = null;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookName() == bookName) {
                libreayInfo = library[index];

            }
        }
        return libreayInfo;
    }

    public boolean updateLibraryBookNameByAuthor(String existingBookAuthor, String updatedBookName) {
        boolean isUpdated = false;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookAuthorName() == existingBookAuthor) {
                library[index].setBookName(updatedBookName);

                isUpdated = true;

                System.out.println("the bookname is succesfully updated");
            }
        }
        return isUpdated;
    }

    public boolean updateLibraryBookAuthorandBookIdandBookPageandBookPublisherbyBookName(String existingBookName, String updatedBookAutor, int updatedBookId, int updatedBookPages, String updatedBookPublisher, String updatedRealesDate) {
        boolean isUpdated = false;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getBookName() == existingBookName) {
                library[index].setBookAuthorName(updatedBookAutor);
                library[index].setBookId(updatedBookId);
                library[index].setNoPages(updatedBookPages);
                library[index].setPublisher(updatedBookPublisher);
                library[index].setReleasedDate(updatedRealesDate);

                isUpdated = true;

                System.out.println("All the books information is succesfully updated");
            }
        }
        return isUpdated;
    }


    public void deleteLibraryBookbybookId(int bookId) {
        System.out.println("invoke the delete method");

        int index, newindex = 0;
        for (index = 0, newindex = 0; index < library.length; index++) {
            if (library[index].getBookId() != bookId) {
                library[newindex++] = library[index];

                System.out.println("the libreary book information is deleted succesfully");
            }
        }
        library = Arrays.copyOf(library, newindex);
    }

    public void getAllNewLibrearyBookInfo() {

        for (int index = 0; index < library.length; index++) {

            System.out.println(library[index].getBookId());
            System.out.println(library[index].getBookName());
            System.out.println(library[index].getBookAuthorName());
            System.out.println(library[index].getPublisher());
            System.out.println(library[index].getReleasedDate());
            System.out.println(library[index].getCountryName());
            System.out.println(library[index].getNoPages());
            System.out.println("........................................");

        }


    }
}



