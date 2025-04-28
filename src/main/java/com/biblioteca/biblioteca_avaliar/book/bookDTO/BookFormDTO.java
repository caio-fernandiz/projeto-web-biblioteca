package com.biblioteca.biblioteca_avaliar.book.bookDTO;

public record BookFormDTO(String title, String author, String synopsis, String releaseDate, String publisher) {
    
    public BookFormDTO toEntity() {
        return new BookFormDTO(null, title, author, synopsis, releaseDate);
    }
}
