import java.util.ArrayList;

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
		
*/	
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
