package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;

public class Library {
	/*
	A class that creates a list called books and  a public string called "adress" and allows books to be added to
	borrowed from, and returned to the Library, also prints Library hours.
 */

	// Constructor – look it up
	ArrayList <Book> books = new ArrayList<Book>();
    String adress;
    

    public Library(String t){ 
        this.adress=t;

    }
    /*
     adds the book to the array for later reference
     */
    public void addBook(Book book){
 
    	this.books.add(book);
    	
    	
    	
        
    }
   
    public static void printOpeningHours(){
    	 /*
    	print the opening hours of  Library
     */
        System.out.println("Libraries are open daily from 9am to 5pm.");

    }
    public void printAddress(){
    	 /*
    	print the opening hours of  Library
     */
        System.out.println(adress);

    }
    
    
    public void borrowBook(String title) {
    	/*
        Method below takes a string and for each book in the array of books  if the book is not marked as borrowed
        it then marks the book as borrowed and displays a message otherwise the book is marked as already borrowed
       */
    	String r = "This book is not in our catalogue";
        for (Book book : books){
       
        if (book.getTitle().equals(title)){
        	if(!book.borrowed) {
        		book.borrowed();
        		r = "You successfully borrowed "+ title;
        	}
        	else {
        		r = "Sorry, this books is already borrowed";
        	}	

        }
        System.out.println(r);
        


    }
    }
   
    public void printAvailableBooks(){
    	 /*
        Method below prints all available books excluding the ones that are borrowed, 
        if there are no books the System will print out there is are no Books
       */
        int size = books.size();
        for(Book book: books) {
        	if(!book.isBorrowed()) {
        		System.out.println(book.getTitle());
        	}
        	else {
        		size -=1;
        	}
        	if(size == 0) {
        		System.out.println("No books in catalog");
        	}
        }

    }
 
    public String returnBook(String r){
    	   /*
        If the title matches the books then it successfully returns the book and marks the book as available again
        */
        for (Book book : books){
            if (book.title.equals(r)){ 
                book.returned();
                System.out.println("You successfully returned" + r);
            	return r; 
            }
            else {
            	return "This book is not ours";}
            }
		return r;
        }

	public static void main(String[] args) { 
		// Create two libraries 
		Library firstLibrary = new Library("10 Main St."); 
		Library secondLibrary = new Library("228 Liberty St."); 

		// Add four books to the first library 
		firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
		firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 

		// Print opening hours and the addresses 
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours(); 
		System.out.println(); 
		System.out.println("Library addresses:"); 
		firstLibrary.printAddress(); 
		System.out.println("Library hours:");
		secondLibrary.printOpeningHours(); 
		System.out.println(); 
		System.out.println("Library addresses:"); 
		secondLibrary.printAddress(); 

		// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
		firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println(); 
		

		// Print the titles of all available books from both libraries System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
		System.out.println(); 
		System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
		System.out.println(); 

		// Return The Lords of the Rings to the first library 
		System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println(); 
 
	   	 }

	}




