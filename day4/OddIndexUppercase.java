package week1.day4;

public class OddIndexUppercase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString ="changeme"; //cHaNgEmE
		String finalOutput="";
		char[] charArray1= testString.toCharArray();
		for(int i=0;i<charArray1.length;i++)
		{
			String uArray;
			
			if(i%2==0)
			{				
				 uArray=String.valueOf(charArray1[i]).toUpperCase();
			}
			else
			{
				uArray=String.valueOf(charArray1[i]);	
			}
			
			 finalOutput=finalOutput+uArray;
			 
		
		}
		System.out.println("Final Output is :"+finalOutput);
	}

}
