package week1.day4;

public class ReverseOddWords {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String testString = "I am a software tester";
		//Expected output: “I ma a erawtfos tester”
		String outString="";
		String[] splitArray = testString.split(" ");
		
		//System.out.println(splitArray);
		for(int i=0;i<splitArray.length;i++)
		{
			if(i%2==0)
			{
				char[] charArrayOdd= splitArray[i].toCharArray();
				outString += " "  + new String(charArrayOdd);
			}
			
			else if(i%2!=0)
			{
				String[] charArrayEven= splitArray[i].split("");
				String evenStr = "";
				for(int j=charArrayEven.length-1;j>=0;j--)
				{
					evenStr +=  new String(charArrayEven[j].toCharArray());
					
				}

				outString += " " + evenStr;
			}
		}
		System.out.println("Output: " + outString);
	}

}
