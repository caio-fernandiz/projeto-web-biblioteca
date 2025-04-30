package com.biblioteca.biblioteca_avaliar.book.util;

import org.apache.commons.validator.routines.ISBNValidator;

public class IsbnValidator {
    private static final ISBNValidator validator = ISBNValidator.getInstance();

    public static boolean isValid(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }
        return validator.isValid(isbn);
    }
}