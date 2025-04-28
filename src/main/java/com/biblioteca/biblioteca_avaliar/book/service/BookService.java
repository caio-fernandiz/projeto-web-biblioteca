package com.biblioteca.biblioteca_avaliar.book.service;

import java.util.List;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

public interface BookService {

    BookDTO saveBook(BookFormDTO form);

    BookDTO updateBook(Long id, BookFormUpdateDTO form);

    List<BookDTO> showAllBooks();

    BookDTO findBookById(Long id);
    BookDTO findBookByIsbn(String isbn);
    BookDTO findBookByTitle(String title);
    BookDTO findBookByAuthor(String author);
    BookDTO findBookByPublisher(String publisher);

    void deleteBook(Long id);
}
