

package com.mycompany.book_user_input;

import java.util.Scanner;


public class Book_User_input {

    private String title;
    private String author;
    private int year;
    private static String genre;
    private static int bookCount = 0;

    public Book_User_input(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    public static void setGenre(String genre) {
        Book_User_input.genre = genre;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }
    public static void displayTotalBooks() {
        System.out.println("Total Number of Books: " + bookCount);
    }
    public static void main(String[] args, Scanner scanner) {
         scanner = new Scanner(System.in);
        System.out.print("Enter the genre of the books: ");
        String genreInput = scanner.nextLine();
        Book_User_input.setGenre(genreInput);
        Book_User_input[] books = new Book_User_input[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 
            books[i] = new Book_User_input(title, author, year);
        }
        for (Book_User_input book : books) 
        {
            book.displayBookDetails();
        }    
        Book_User_input.displayTotalBooks();
        scanner.close();
    }
}

