package com.biblioteca.biblioteca_avaliar.book.service;

import org.springframework.stereotype.Component;

import com.biblioteca.biblioteca_avaliar.book.Book;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;
import com.biblioteca.biblioteca_avaliar.book.util.IsbnValidator;

@Component
public class BookUpdater {

    public void updateBook(Book book, BookFormUpdateDTO form) {
        if (form.isbn() != null){
            if(!IsbnValidator.isValid(form.isbn())){
                throw new IllegalArgumentException("ISBN is not valid");
            }
            book.setIsbn(form.isbn());
        }

        if (form.title() != null)
            book.setTitle(form.title());

        if (form.author() != null)
            book.setAuthor(form.author());

        if (form.synopsis() != null)
            book.setSynopsis(form.synopsis());

        if (form.releaseDate() != null)
            book.setReleaseDate(form.releaseDate());

        if (form.publisher() != null)
            book.setPublisher(form.publisher());

    }

}
