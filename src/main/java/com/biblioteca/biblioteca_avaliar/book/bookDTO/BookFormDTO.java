package com.biblioteca.biblioteca_avaliar.book.bookDTO;

import com.biblioteca.biblioteca_avaliar.book.Book;
import com.biblioteca.biblioteca_avaliar.book.util.IsbnValidator;

public record BookFormDTO(String isbn, String title,  String author, String synopsis, String releaseDate, String publisher) {
    
    public Book toEntity(){
        if(!IsbnValidator.isValid(isbn)){
            throw new IllegalArgumentException("ISBN is not valid");
        }
        return new Book(null, isbn, title,  author, synopsis, releaseDate, publisher);
    }
}
