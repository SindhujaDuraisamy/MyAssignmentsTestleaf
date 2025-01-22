package week1.day3;

public class Library {
	
	//method with return type to add book
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	//method without return type to issue book
	
	public void issueBook()
	{
		System.out.println("Book Issued Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library libObj=new Library();
		System.out.println(libObj.addBook("Chetan Bhagat"));
		libObj.issueBook();

	}

}
