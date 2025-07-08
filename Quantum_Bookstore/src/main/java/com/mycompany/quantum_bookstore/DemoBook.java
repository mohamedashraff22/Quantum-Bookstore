package com.mycompany.quantum_bookstore;

public class DemoBook extends Book {
    public DemoBook(String isbn, String title, String author, int year) {
        super(isbn, title, author, year, 0.0);
    }

    @Override
    void Selling(int quantity, String email, String address) {
        throw new IllegalArgumentException("Demo books are not for sale!");
    }
}
    

