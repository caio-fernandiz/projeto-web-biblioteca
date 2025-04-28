package com.biblioteca.biblioteca_avaliar.book.bookDTO;

import com.biblioteca.biblioteca_avaliar.book.Book;

public record BookFormDTO(String title, String isbn, String author, String synopsis, String releaseDate, String publisher) {
    
    public Book toEntity(){
        return new Book(null, title, isbn, author, synopsis, releaseDate, publisher);
    }
}
