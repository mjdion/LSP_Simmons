package org.howard.edu.lsp.assignment2;

public class Book {
	/*
	  The class below creates the Book type which is 
	  an object to be manipulated by the Library class
	 */
	

    public String title; 
    boolean borrowed; 

    
    public Book(String bookTitle) {
    	// Creates a new Book 
      this.title = bookTitle;
    } 
    
    public void borrowed() {
    	// Marks the book as rented 
       this.borrowed = true;
    } 
    
    public void returned() {
    	// Marks the book as not rented 
      this.borrowed = false;
    } 
    
    public boolean isBorrowed() {
    	// Returns true if the book is rented, false otherwise public 
      if (this.borrowed==true){

        return true;
      }
      else {
        return false;
      }
      
    } 
    
    public String getTitle() {
    	// Returns the title of the book public 
    	return this.title;
    	//Scanner input = new Scanner(System.in);
  
    	
    	
    }
    public static void main(String[] args) {
    	
	
		// TODO Auto-generated method stub

	}
    


    
      
    }

