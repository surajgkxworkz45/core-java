package com.xworkz.libraryapp.library;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Library {



    private int bookId;
    private String bookName;
    private String bookAuthorName;
    private String releasedDate;
    private String publisher;
    private int noPages;
    private String countryName;
}
