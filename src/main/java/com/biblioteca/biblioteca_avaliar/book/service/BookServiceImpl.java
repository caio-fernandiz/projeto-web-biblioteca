package com.biblioteca.biblioteca_avaliar.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.biblioteca_avaliar.book.Book;
import com.biblioteca.biblioteca_avaliar.book.BookRepository;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;

public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    private final BookUpdater bookUpdater;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, BookUpdater bookUpdater) {
        this.bookRepository = bookRepository;
        this.bookUpdater = bookUpdater;
    }

    @Override
    public BookDTO saveBook(BookFormDTO form) {
        Book book = form.toEntity();
        return new BookDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO updateBook(Long id, BookFormUpdateDTO form) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookUpdater.updateBook(book, form);
        return new BookDTO(bookRepository.save(book));
    }

    @Override
    public List<BookDTO> showAllBooks() {
        return bookRepository.findAll().stream().map(BookDTO::new).collect(Collectors.toList());
    }

    @Override
    public BookDTO findBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return new BookDTO(book);
    }

    @Override
    public BookDTO findBookByIsbn(String isbn) {
        Book book = bookRepository.findByIsbn(isbn).orElseThrow(() -> new RuntimeException("Book not found"));
        return new BookDTO(book);
    }

    @Override
    public BookDTO findBookByTitle(String title) {
        Book book = bookRepository.findByTitle(title).orElseThrow(() -> new RuntimeException("Book not found"));
        return new BookDTO(book);
    }

    @Override
    public BookDTO findBookByAuthor(String author) {
        Book book = bookRepository.findByAuthor(author).orElseThrow(() -> new RuntimeException("Book not found"));
        return new BookDTO(book);
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
