package com.mycompany.quantum_bookstore;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
    private ArrayList<Book> inventory;

    public BookStore() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Added book: " + book.title);
    }

    public ArrayList<Book> removeOutdatedBooks(int currentYear, int yearsThreshold) {
        ArrayList<Book> removedBooks = new ArrayList<>();
        Iterator<Book> iterator = inventory.iterator();
        
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (currentYear - book.getYear() > yearsThreshold) {
                removedBooks.add(book);
                iterator.remove();
                System.out.println("Removed outdated book: " + book.title);
            }
        }
        return removedBooks;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                book.Selling(quantity, email, address);
                return book.price*quantity;
            }
        }
        throw new IllegalArgumentException("Book: " + isbn + " is not found!");
    }   
}
