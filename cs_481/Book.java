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
	public static File bookFile; 
	public static String title;
	public static String author;
	public static int age;
	public static int ISBN;
	//public static Book bookObject;
	
	
	
	static ArrayList<Book> booksList = new ArrayList<Book>();
	
	public Book(File bookFile, String author, int ISBN, String title, int age) {
	/*	setBookFile(bookFile);
		setAuthor(author);
		setISBN(ISBN);
		setTitle(title);
		setAge(age);
		*/
		this.bookFile = bookFile;
		this.author = author;
		this.title = title;
		this.age = age;
		
	}


	public static void main (String[] args) throws IOException
	{
		System.out.println ("testing");
	//	File file = null;
		File newBook = new File ("/Users/Morgan/Desktop/test1.txt");
		
		Desktop desktop = Desktop.getDesktop();
		
		desktop.open(newBook);
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the title: ");
		String title = reader.nextLine(); 
		System.out.println("Enter the author: ");
		String author = reader.nextLine(); 
		System.out.println("Enter the ISBN: ");
		int ISBN = reader.nextInt(); 
		System.out.println("Enter the age this book is for: ");
		int age = reader.nextInt();
		reader.close();
		
		System.out.println("Title is " + title + " author is: " + author + " isbn is: " + ISBN + " age is: " + age);
		
		AddBook(newBook, author, ISBN, title, age);
		
		for (int i = 0; i < booksList.size(); i++) {
            Book value = booksList.get(i);
            System.out.println("Title: " + value.title);
            System.out.println("Author: " + value.author);
            System.out.println("ISBN: " + value.ISBN);
            System.out.println("Age: " + value.age);
        }
		
	//	book = new File ("C:~/_Software/test2.txt");
	//	if (book.exists()) desktop.open(file);
	//	book = new File ("C:~/_Software/test3.txt");
	//	if (book.exists()) desktop.open(file);
	}
	

	/*public void setBook(File x){
		this.bookObject = x; 
		}
	*/
	public Book getBook(Book x){
		return x; 
	}
	public static void setAuthor(String author){
		Book.author = author;
	}
	public String getAuthor(Book x){
		return Book.author;
	}
	public static void setTitle(String title){
		Book.title = title;
	}
	public String getTitle(Book x){
		return Book.title;
	}
	public static void setISBN(int ISBN){
		Book.ISBN = ISBN;
	}
	public int getISBN(Book x){
		return  Book.ISBN;
	}
	public static void setAge(int age) {
		Book.age = age;
	}
	public int getAge (Book x) {
		return Book.age;
	}
	public void setBookFile(File bookfile) {
		Book.bookFile = bookfile;
	}
	public File getBookFile (Book x) {
		return Book.bookFile;
	}

	
	@SuppressWarnings("unused")
	public static void AddBook(File x,String author,int ISBN,String title, int age ){
		boolean insystem = CompareBook(x, ISBN);
		if (insystem = true){
			System.out.println("Book already exists");
		}
		
		else
		
		
		{
			Book addingThis = new Book(bookFile, author, ISBN, title, age);
			booksList.add(addingThis);
		//	System.out.println(booksList);
		}
	}
	


	public static boolean CompareBook(File x, int ISBN){
		
		for (int i = 0; i < booksList.size(); i++) {
            Book value = booksList.get(i);
    
            if(value.ISBN == ISBN) {
            		return true;
            }
            else i++;
        }
		return false;
		/*
			if (booksList.contains(x))
					{
						return true;//book in system
					}
			else
				return false;
				*/
	}
	
	public void DeleteFromSystem(Book x)
	{
		if (booksList.contains(x))
		{
			int y = booksList.indexOf(x);
			booksList.remove(y);
		}
		else
			System.out.println("Book is not in system");
	}
}

