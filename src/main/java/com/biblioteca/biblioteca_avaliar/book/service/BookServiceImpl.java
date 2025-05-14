package com.biblioteca.biblioteca_avaliar.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.biblioteca_avaliar.book.Book;
import com.biblioteca.biblioteca_avaliar.book.BookRepository;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;
import com.biblioteca.biblioteca_avaliar.book.util.IsbnValidator;

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
        if(bookRepository.existsByIsbn(book.getIsbn())) {
            throw new RuntimeException("Book with this ISBN already exists");
        }
        return new BookDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO updateBookById(Long id, BookFormUpdateDTO form) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        if(!form.isbn().equals(book)){
            if(!IsbnValidator.isValid(form.isbn())){
                throw new IllegalArgumentException("ISBN is not valid");
            }
            if(bookRepository.existsByIsbn(form.isbn())) {
                throw new RuntimeException("Book with this ISBN already exists");
            }
        }
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
        Book book = bookRepository.findByAuthor(author).orElseThrow(() -> new RuntimeException("author not found"));
        return new BookDTO(book);
    }

    @Override
    public BookDTO findBookByPublisher(String publisher) {
        Book book = bookRepository.findByPublisher(publisher).orElseThrow(() -> new RuntimeException("Pusblisher not found"));
        return new BookDTO(book);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.delete(book);
    }



}
