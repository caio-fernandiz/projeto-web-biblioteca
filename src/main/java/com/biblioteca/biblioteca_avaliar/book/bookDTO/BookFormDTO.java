package com.biblioteca.biblioteca_avaliar.book.bookDTO;

import com.biblioteca.biblioteca_avaliar.book.Book;

public record BookFormDTO(String isbn, String title,  String author, String synopsis, String releaseDate, String publisher) {
    
    public Book toEntity(){
        return new Book(null, isbn, title,  author, synopsis, releaseDate, publisher);
    }
}
