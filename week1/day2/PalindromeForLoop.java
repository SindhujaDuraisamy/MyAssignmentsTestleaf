package week1.day2;

public class PalindromeForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: 121 -> Output: It is a Palindrome (because the number reads the same backward and forward)
		int input=121;
		int output=0;
		//int i=input;
		for(int i=input;i>0;i=i/10)
		{
			//System.out.println("for loop I is: " +i);
			int rem=i%10;
			//System.out.println("for loop input: " +rem);
		    output=(output*10)+rem;
		    //input=input/10;
		   // System.out.println("for loop output: " +output);
		}  
		    
		
		 
		 if(input == output)
		 {
			 System.out.println(output +" is a palindrome number");
		 }
		 else
		 {
			 System.out.println(output +" is not a palindrome number"); 
		 }
		}

	}

