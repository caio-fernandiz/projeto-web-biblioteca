package com.biblioteca.biblioteca_avaliar.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookDetailsDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormDTO;
import com.biblioteca.biblioteca_avaliar.book.bookDTO.BookFormUpdateDTO;
import com.biblioteca.biblioteca_avaliar.book.service.BookService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
@RequestMapping("/biblioteca")
public class BookController {
    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookDTO> saveBook(@Valid @RequestBody BookFormDTO bookFormDTO) {
        BookDTO bookDTO = bookService.saveBook(bookFormDTO);
        return new ResponseEntity<>(bookDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDTO> updateBookById(@PathVariable Long id, @RequestBody BookFormUpdateDTO updateForm){
        BookDTO updateBookById = bookService.updateBookById(id, updateForm);
        return ResponseEntity.ok(updateBookById);
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> showAllBook(){
        List<BookDTO> allBooks = bookService.showAllBooks();
        return new  ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDetailsDTO> findBookById(@PathVariable Long id)  {
        BookDetailsDTO bookById =  bookService.findBookById(id);
    }
    
}