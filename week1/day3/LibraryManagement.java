package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of another class Library in this Class LibraryManagement
		Library libObj=new Library();
		//Accessing methods from another class in the same package
		System.out.println(libObj.addBook("Two States"));
		libObj.issueBook();
	}

}
