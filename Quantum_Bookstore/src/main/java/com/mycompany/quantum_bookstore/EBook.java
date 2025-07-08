package com.mycompany.quantum_bookstore;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        super(isbn, title, author, year, price);
        this.fileType = fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    
    public String getFileType() {
        return fileType;
    }
    
    @Override
    void Selling(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

