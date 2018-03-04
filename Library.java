package cs_481;
import java.util.*;
//import Book.java;

import java.io.File;

/*Probably have to create something to store the data for long term use so it doesn't
 * stop as soon as we exit the program
 */
//books are files stored in an array list
//public class Library<Book> {
public class Library {
	/*public  File bookFile; 
	public  String title;
	public String author;
	public  int age;
	public  int ISBN;
	
	Book bookUse = new Book(bookFile, author, ISBN, title, age);*/
	
	static ArrayList<Library> libraries = new ArrayList<Library>();
	static ArrayList<Book> libraryContents = new ArrayList<Book>();
	public static String libraryName;
	public static int libraryNumber;
	public static void createLibrary(String libraryName, ArrayList<Book> books, int libraryNumber){ //Have to take out libraryname to have this as originally stated
		Library.libraryName = libraryName; //really, this initializes the library
		Library.libraryContents = books;
		Library.libraryNumber = libraryNumber;
		//int i = libraries.size();
		//libraries.add(i, )
	} 
	//int i = booksList.size();
	//Book addingThis = new Book(bookFile, author, ISBN, title, age);
	//booksList.add(i, addingThis);
	public static void addBookToLibrary(Book book) {
		boolean inLibrary = CompareBook(book.ISBN);
		if(inLibrary == true) {
			System.out.println("Book is already in the library");
		}
		else {
			libraryContents.add(book);
		}
	}
	public static void removeBookFromLibrary(Book book) {
		//ask for confirmation for removal
		int searchISBN = book.ISBN;
		//boolean inLibrary = CompareBook(book.ISBN);
		//if(inLibrary == true) {
		for(int i = 0; i < libraryContents.size(); i++){
			if(libraryContents.get(i).ISBN == searchISBN) {
				libraryContents.remove(i);
				break;
				//}
			}
		}
	}
	
	public static boolean CompareBook(int ISBN){
		if (libraryContents.size() == 0)
		{return false;}
		else {
		for (int i = 0; i < libraryContents.size(); i++) {
			
				Book value = libraryContents.get(i); //changed to work with the library
    
            if(value.ISBN == ISBN) {
            		return true;
            }
            
        }
		return false;
		}
	}
	
	public static void displayAllBooks() {
		for(int i = 0; i < libraryContents.size(); i++) {
			System.out.println(libraryContents.get(i).title);
		}
	}
	/*public void addBooktoLibrary(ArrayList<Book> lib, Book x)
	{
		boolean inLibrary = CompareBook(x, ISBN);
		if (inLibrary == true)
		{
		System.out.println("Book already in library");
		}
		lib.add(x);
	}*/
	
}
/*
 * import java.util.ArrayList;

public class Library<Book> {

	
	
/*	public static String title;
	public Library(String title)
	{
		Library.title = title;
	}
	
	public static void setTitle(String title){
		Library.title = title;
	}
	public String getTitle(Book x){
		return Library.title;
	}
		public void createLibrary(String x)
		{
		ArrayList<Book> x = new ArrayList<Book>();
		}
	
	
	
		public void addBooktoLibrary(ArrayList<Book> lib, Book x)
		{
			boolean inLibrary = CompareBook(x, ISBN);
			if (inLibrary == true)
			{
			System.out.println("Book already in library");
			}
			lib.add(x);
		}
	
		public void removeBookfromLibrary(ArrayList<Book> lib, Book x)
		{
			lib.remove(x);
		}
		
		public void removeLibrary(ArrayList<Book> lib)
		{
			lib.clear();
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
 */
