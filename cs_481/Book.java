package cs_481;

import java.util.*;
//package cs_481;

import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;


public static void main (String[] args) throws IOException
{
	System.out.println ("testing");
}
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
while (readbuffer1 != readbuffer2)ß
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

public class Book {
	public Book book; 
	public char[] title;
	public char[] author;
	public int age;
	public int ISBN;
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void setBook(Book x){
		this.book = x; 
		}
	
	public Book getBook(Book x)
	{
		return x; 
	}
	
	public void setAuthor(char[] author){
		this.author = author;
	}
	public char[] getAuthor(char[] author){
		return author;
	}
	public void setTitle(char[] title){
		this.title = title;
	}
	public char[] getTitle(char[] title){
		return title;
	}
	public void setISBN(int ISBN){
		this.ISBN = ISBN;
	}
	public int getISBN(int ISBN){
		return  ISBN;
	}
	
	@SuppressWarnings("unused")
	public void AddBook(Book x,char author[],int ISBN,char title[] ){
		boolean insystem = CompareBook(x);
		if (insystem = true){
			System.out.println("Book already exists");
		}
		else
		{
			books.add(x);
			x.setAuthor(author);
			x.setISBN(ISBN);
			x.setTitle(title);
			x.setBook(x);
		}
	}
	
	public boolean CompareBook(Book x){
		
			if (books.contains(x))
					{
						return true;//book in system
					}
			else
				return false;
	}
	
	public void DeleteFromSystem(Book x)
	{
		if (books.contains(x))
		{
			int y = books.indexOf(x);
			books.remove(y);
		}
		else
			System.out.println("Book is not in system");
	}
}

