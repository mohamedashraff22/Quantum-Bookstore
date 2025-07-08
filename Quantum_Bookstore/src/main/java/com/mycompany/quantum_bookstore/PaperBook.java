package com.mycompany.quantum_bookstore;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int getStock() {
        return stock;
    }

    @Override
    void Selling(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Not enough books in stock for " + title);
        }
        stock -= quantity;
        System.out.println("Shipping book: " + title + "to: " + address);
    }
}
