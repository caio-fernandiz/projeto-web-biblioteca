package com.biblioteca.biblioteca_avaliar.book.service;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

public interface BookService {

    BookDTO saveBook(BookFormDTO form);

    BookDTO updateBook(Long id, BookFormUpdateDTO form);
}
