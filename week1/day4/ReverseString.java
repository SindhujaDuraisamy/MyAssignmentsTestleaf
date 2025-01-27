package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="Testleaf";
		char[] charArray = companyName.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.println(charArray[i]);
		}
	}

}
