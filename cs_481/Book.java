package cs_481;

import java.util.*;
//package cs_481;

import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;



/*
//Opening a text file that the book will be in
//create a writer to the print the words to the third txt file
File book = new File ("C:~/_Software/test1.txt");
Desktop desktop = Desktop.getDesktop();
if(book.exists()) desktop.open(file);
book = new File ("C:~/_Software/test2.txt");
if (book.exists()) desktop.open(file);
book = new File ("C:~/_Software/test3.txt");
if (book.exists()) desktop.open(file);
 
//Use a ReaderBuffer and go through both files and open another file and use i for dictionary and j for txt than when the word is found increase i and open another file and 
//print that word there
while (ReadBuffer1 != null)
{
while (readbuffer1 != readbuffer2)
{
readbuffer2 += 1;
if (readbuffer2 == null)
break;
}
if (readbuffer1 == readbuffer2)
{
//print the word to the third file
writer.write (Readbuffer1);

	
}
 
}
 
}
Scanner sc = new Scanner(new File("test1.txt"));
while(sc.hasNext()) {
String line = sc.nextLine();ß
}

}
*/

@SuppressWarnings("unused")
public class Book {
	public static File bookFile; 
	public static String title;
	public static String author;
	public int age;
	public static int ISBN;
	public static Book bookObject;
	
	
	
	static ArrayList<Book> booksList = new ArrayList<Book>();
	
	public Book(File book, String author, int ISBN, String title) {
		// TODO Auto-generated constructor stub
	}


	public static void main (String[] args) throws IOException
	{
		System.out.println ("testing");
	//	File file = null;
		File book = new File ("/Users/Morgan/Desktop/test1.txt");
		
		Desktop desktop = Desktop.getDesktop();
		
		desktop.open(book);
		
		AddBook(book, "Mary Smith", 109282, "Book1");
		
	//	book = new File ("C:~/_Software/test2.txt");
	//	if (book.exists()) desktop.open(file);
	//	book = new File ("C:~/_Software/test3.txt");
	//	if (book.exists()) desktop.open(file);
	}
	

	public void setBook(File x){
		this.bookObject = x; 
		}
	
	public Book getBook(Book x)
	{
		return x; 
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(String author){
		return author;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(String title){
		return title;
	}
	public void setISBN(int ISBN){
		this.ISBN = ISBN;
	}
	public int getISBN(int ISBN){
		return  ISBN;
	}
	
	@SuppressWarnings("unused")
	public static void AddBook(File x,String author,int ISBN,String title ){
		boolean insystem = CompareBook(x);
		if (insystem = true){
			System.out.println("Book already exists");
		}
		else
		{
			Book addingThis = new Book(book, author, ISBN, title);
			booksList.add(New(addingThis));
			/*x.setAuthor(author);
			x.setISBN(ISBN);
			x.setTitle(title);
			x.setBook(x);
			*/
		}
	}
	
	private static Book New(Book x) {
		
		// TODO Auto-generated method stub
		
		x.setAuthor(author);
		x.setISBN(ISBN);
		x.setTitle(title);
		//x.setBook(x);
		
		return null;
	}


	public static boolean CompareBook(File x){
		
			if (booksList.contains(x))
					{
						return true;//book in system
					}
			else
				return false;
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

