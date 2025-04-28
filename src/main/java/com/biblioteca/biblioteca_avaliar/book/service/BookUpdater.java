package com.biblioteca.biblioteca_avaliar.book.service;

import org.springframework.stereotype.Component;

import com.biblioteca.biblioteca_avaliar.book.Book;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

@Component
public class BookUpdater {

    public void updateBookDetails(Book book, BookFormUpdateDTO bookFormUpdateDTO) {
        if (bookFormUpdateDTO.title() != null)
            book.setTitle(bookFormUpdateDTO.title());

        if (bookFormUpdateDTO.author() != null)
            book.setAuthor(bookFormUpdateDTO.author());

        if (bookFormUpdateDTO.synopsis() != null)
            book.setSynopsis(bookFormUpdateDTO.synopsis());

        if (bookFormUpdateDTO.releaseDate() != null)
            book.setReleaseDate(bookFormUpdateDTO.releaseDate());

        if (bookFormUpdateDTO.publisher() != null)
            book.setPublisher(bookFormUpdateDTO.publisher());

    }

}
