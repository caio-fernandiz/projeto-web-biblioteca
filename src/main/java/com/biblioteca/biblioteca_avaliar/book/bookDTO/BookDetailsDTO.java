package com.biblioteca.biblioteca_avaliar.book.bookDTO;

import com.biblioteca.biblioteca_avaliar.book.Book;

public record BookDetailsDTO(Long id, String isbn, String title, String author, String synopsis, String releaseDate, String publisher) {

    public BookDetailsDTO(Book book) {
        this(book.getId(), book.getIsbn(), book.getTitle(), book.getAuthor(), book.getSynopsis(), book.getReleaseDate(), book.getPublisher());
    }
}
