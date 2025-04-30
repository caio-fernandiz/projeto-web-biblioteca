package com.biblioteca.biblioteca_avaliar.book.util;

import org.apache.commons.validator.routines.ISBNValidator;
import org.springframework.stereotype.Component;

@Component
public class IsbnValidator {
    
    private final ISBNValidator isbnValidator;

    public IsbnValidator() {
        this.isbnValidator = ISBNValidator.getInstance();
    }

    public boolean isValid(String isbn) {
        if (isbn == null) {
            return false;
        }
        return isbnValidator.isValid(isbn);
    }
}