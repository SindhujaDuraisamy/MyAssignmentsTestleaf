package week1.day2;

public class FibonacciForLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.
		int range=8;
		int n1=0;
		int n2=1;
		System.out.println("Fibonnaci series of" +range+ "numbers are:");
		for(int i=1;i<=range;i++)
		{	
			System.out.println(n1 + " ");
			int sumOfFirstTwo=n1+n2;
			n1=n2;
			n2=sumOfFirstTwo;
			
		}
	}

}
