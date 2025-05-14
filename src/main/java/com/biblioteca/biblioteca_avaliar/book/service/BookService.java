package com.biblioteca.biblioteca_avaliar.book.service;

import java.util.List;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDetailsDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

public interface BookService {

    BookDTO saveBook(BookFormDTO form);

    BookDTO updateBookById(Long id, BookFormUpdateDTO form);

    List<BookDTO> showAllBooks();

    BookDetailsDTO findBookById(Long id);
    BookDetailsDTO findBookByIsbn(String isbn);
    BookDetailsDTO findBookByTitle(String title);
    BookDetailsDTO findBookByAuthor(String author);
    BookDetailsDTO findBookByPublisher(String publisher);

    void deleteBook(Long id);
}
