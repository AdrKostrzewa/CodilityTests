package com.testapp.korepetycjedom.book;

public class BookNotFoundException extends Exception {

    //stworzyłem swój wyjątek
    public BookNotFoundException(Long id) {
        super(String.format("Book %d doesn't exist!", id));
    }
}
