package com.biblioteca.biblioteca_avaliar.book.service;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;

public interface BookService {

    BookDTO saveBook(BookFormDTO form);
}
