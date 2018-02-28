package cs_481;

import java.util.*;
//package cs_481;

import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;
import java.awt.Point;
import java.io.IOException;



@SuppressWarnings("unused")
public class Book {
	public  File bookFile; 
	public  String title;
	public String author;
	public  int age;
	public  int ISBN;
	
	static ArrayList<Book> booksList = new ArrayList<Book>();
	
	public Book(File bookFile, String author, int ISBN, String title, int age) {
		this.bookFile = bookFile;
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
		this.age = age;
		
	}


	public static void main (String[] args) throws IOException
	{
		System.out.println ("testing");
	//	File file = null;
		File newBook = new File ("/Users/Morgan/Desktop/test1.txt");
		
		Desktop desktop = Desktop.getDesktop();
		
		desktop.open(newBook);
		File newBook2 = new File ("/Users/Morgan/Desktop/test2.txt");
		
		desktop.open(newBook2);
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
	/*	System.out.println("Enter the title: ");
		String title = reader.nextLine(); 
		System.out.println("Enter the author: ");
		String author = reader.nextLine(); 
		System.out.println("Enter the ISBN: ");
		int ISBN = reader.nextInt(); 
		System.out.println("Enter the age this book is for: ");
		int age = reader.nextInt();
		reader.close();
		*/
		//System.out.println("Title is " + title + " author is: " + author + " isbn is: " + ISBN + " age is: " + age);
		
		//AddBook(newBook, author, ISBN, title, age);
		AddBook(newBook, "author1", 72927, "Title1", 12);
		AddBook(newBook2, "author2", 12929, "Title2", 13);
		
		System.out.println("Size of array is: " + booksList.size());
		for (int i = 0; i < booksList.size(); i++) {
            Book value = booksList.get(i);
            System.out.println(value);
            System.out.println("Title: " + value.title);
            System.out.println("Author: " + value.author);
            System.out.println("ISBN: " + value.ISBN);
            System.out.println("Age: " + value.age);
        }
		DeleteFromSystem(12929);
		System.out.println("Delete book 2");
		AddBook(newBook2, "author3", 12929, "Title3", 14);
		System.out.println("Size of array is: " + booksList.size());
		for (int i = 0; i < booksList.size(); i++) {
           System.out.println("Add book2 again");
			Book value = booksList.get(i);
            System.out.println(value);
            System.out.println("Title: " + value.title);
            System.out.println("Author: " + value.author);
            System.out.println("ISBN: " + value.ISBN);
            System.out.println("Age: " + value.age);
        }
		
		
	/*	for (int i = 0; i < booksList.size(); i++) {
            Book value = booksList.get(i);
            System.out.println("Deleted?");
            System.out.println("Title: " + value.title);
            System.out.println("Author: " + value.author);
            System.out.println("ISBN: " + value.ISBN);
            System.out.println("Age: " + value.age);
        }
        */
		
		
	//	book = new File ("C:~/_Software/test2.txt");
	//	if (book.exists()) desktop.open(file);
	//	book = new File ("C:~/_Software/test3.txt");
	//	if (book.exists()) desktop.open(file);
	}
	


	public Book getBook(Book x){
		return x; 
	}
/*	public static void setAuthor(String author){
		Book.author = author;}
	public String getAuthor(Book x){
		return Book.author;}
	public static void setTitle(String title){
		Book.title = title;}
	public String getTitle(Book x){
		return Book.title;}
	public static void setISBN(int ISBN){
		Book.ISBN = ISBN;}
	public int getISBN(Book x){
		return  Book.ISBN;}
	public static void setAge(int age) {
		Book.age = age;}
	public int getAge (Book x) {
		return Book.age;}
	public void setBookFile(File bookfile) {
		Book.bookFile = bookfile;}
	public File getBookFile (Book x) {
		return Book.bookFile;}
*/
	
	@SuppressWarnings("unused")
	public static void AddBook(File bookFile,String author,int ISBN,String title, int age ){
		boolean insystem = CompareBook(ISBN);
		if (insystem == true){
			System.out.println("Book already exists");
		}
		
		else {
			int i = booksList.size();
			Book addingThis = new Book(bookFile, author, ISBN, title, age);
			booksList.add(i, addingThis);
		}
		}

	public static boolean CompareBook(int ISBN){
		if (booksList.size() == 0)
		{return false;}
		else {
		for (int i = 0; i < booksList.size(); i++) {
			
				Book value = booksList.get(i);
    
            if(value.ISBN == ISBN) {
            		return true;
            }
            
        }
		return false;
		}
	}
	
	public static void DeleteFromSystem(int ISBN)
	{
		for (int i = 0; i < booksList.size(); i++) {
            Book value = booksList.get(i);
    
            if(value.ISBN == ISBN) {
            	 booksList.remove(i);	
            }
        }
		
	}
		}

