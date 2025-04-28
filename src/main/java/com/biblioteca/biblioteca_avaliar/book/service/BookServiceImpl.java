package com.biblioteca.biblioteca_avaliar.book.service;

import java.util.List;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

public class BookServiceImpl implements BookService{

    @Override
    public BookDTO saveBook(BookFormDTO form) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveBook'");
    }

    @Override
    public BookDTO updateBook(Long id, BookFormUpdateDTO form) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public List<BookDTO> showAllBooks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAllBooks'");
    }

    @Override
    public BookDTO findBookById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBookById'");
    }

    @Override
    public BookDTO findBookByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBookByTitle'");
    }

    @Override
    public BookDTO findBookByAuthor(String author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBookByAuthor'");
    }

    @Override
    public BookDTO findBookByPublisher(String publisher) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBookByPublisher'");
    }

    @Override
    public void deleteBook(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

}
