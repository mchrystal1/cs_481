package cs_481;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.io.PrintWriter;

public class dictionary
{
public static void main (String[] args) throws IOException
{
PrintWriter writer = new PrintWriter ("/Users/Morgan/Desktop/test3.txt");
File Book = new File ("/Users/Morgan/Desktop/test1.txt");
Desktop desktop = Desktop.getDesktop();
if(Book.exists()) desktop.open(Book);
File Dictionary = new File ("/Users/Morgan/Desktop/test2.txt");
if (Dictionary.exists()) desktop.open(Dictionary);
File OutFile = new File ("/Users/Morgan/Desktop/test3.txt");
if (OutFile.exists()) desktop.open(OutFile);
Scanner sc1 = new Scanner(Book);
Scanner sc2 = new Scanner(Dictionary);
while(sc1.hasNext())
{
String word1 = sc1.next();
sc2 = new Scanner(Dictionary);
while (sc2.hasNext())
{
String word2 = sc2.next();
//writer.println(word1 + " " + word2);
if (word1.equalsIgnoreCase(word2))
{
writer.println(word1);
}

}
}
writer.close();
sc1.close();
sc2.close();
}
}
