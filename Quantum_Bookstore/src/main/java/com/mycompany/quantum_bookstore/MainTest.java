package com.mycompany.quantum_bookstore;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        BookStore store = new BookStore();

        PaperBook paperBook1 = new PaperBook("1", "Java Book", "Mohamed", 2015, 100, 5);
        PaperBook paperBook2 = new PaperBook("2", "Harry Potter", "JK Rolling", 2012, 150, 0);
        EBook ebook1 = new EBook("3", "Data Structures And Algorithms Book", "Ashraf", 2022, 50, "PDF");
        DemoBook demoBook = new DemoBook("4", "Learn English", "Yassin", 2000);

        store.addBook(paperBook1);
        store.addBook(paperBook2);
        store.addBook(ebook1);
        store.addBook(demoBook);

        // Test 1: Normal Buying Book
        System.out.println("\nTest 1: Normal Buying Book");
        try {
            double total = store.buyBook("1", 2, "adel222@mail.com", "Cairo");
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");

        
        
        // Test 2: Buy EBook
        System.out.println("\nTest 2: Buy EBook");
        try {
            double total = store.buyBook("3", 1, "anas@mail.com", "Alexandria");
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");
        
        

        // Test 3: Buy Out of Stock Paper Book
        System.out.println("\nTest 3: Out of Stock Paper Book");
        try {
            double total = store.buyBook("2", 1, "mail@mail.com", "Sinai");
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");
        
       

        // Test 4: Buy Demo Book
        System.out.println("\nTest 4: Demo Book ");
        try {
            double total = store.buyBook("4", 1, "nada@mail.com", "Cairo");
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");
        
        
        
        // Test 5: Buy EBook with quantity > 1 (not allowed)
        System.out.println("\nTest 5: EBook quantity > 1");
        try {
            double total = store.buyBook("3", 2, "rana@mail.com", "Cairo");
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");

        
        
        // Test 6: Remove Outdated Books (more than 10 years)
        System.out.println("\nTest 6: Remove Outdated Books");
        store.removeOutdatedBooks(2025, 10);
        System.out.println("==================================================");

        
        
        // Test 7: User Input
        System.out.println("\nTest 7: User Input");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();

        System.out.print("Enter your address: ");
        String userAddress = scanner.nextLine();
        
        System.out.print("Enter Book ISBN (ID): ");
        String BookISBN = scanner.nextLine();

        try {
            double total = store.buyBook(BookISBN, 1, userEmail, userAddress);
            System.out.println("Quantum book store: Total paid: " + total);
        } catch (Exception e) {
            System.out.println("Quantum book store error: " + e.getMessage());
        }
        System.out.println("==================================================");
    }
}
