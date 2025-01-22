package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A prime number is a natural number greater than 1 that has no positive divisors other than
		//1 and itself. In simpler terms, it cannot be evenly divided by any other numbers except 1 and the number itself.
		int input=1;
		boolean isPrime=true;
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime)
		{
			System.out.println(input + "is Prime");
		}
		else
		{
			System.out.println(input + "is not Prime");
		}
	
	}
}
