package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String textInput1="stops";
	String textInput2="potss";
	
	
	int textInput1Length=textInput1.length();
	System.out.println(textInput1Length);
	
	
	int textInput2Length=textInput2.length();
	System.out.println(textInput2Length);
	
	if(textInput1Length==textInput2Length)
	{	
		System.out.println("Both stringa are of same length");
	}
	else
	{
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	}
		char[] charArrayInput1 = textInput1.toCharArray();
		char[] charArrayInput2 = textInput2.toCharArray();
	
		System.out.println("Arrays before Sorting");
		System.out.println(charArrayInput1);
		System.out.println(charArrayInput2);
		
		Arrays.sort(charArrayInput1);
		Arrays.sort(charArrayInput2);
		
		System.out.println("Arrays after Sorting");
		System.out.println(charArrayInput1);
		System.out.println(charArrayInput2);
		
		if(Arrays.equals(charArrayInput1, charArrayInput2))
		{
			System.out.println("The Given Strings are Anagram");
			
		}
		else
		{
			System.out.println("The Given Strings are not an Anagram");
		}
		/*for(int i=0;i<=textInput1Length;i++)
		{
				if(charArrayInput1[i]==charArrayInput2[i])
				{
					System.out.println("The Given Strings are Anagram");
				}
				else
				{
					System.out.println("The Given Strings are not an Anagram");
				}
				
			
			
		}*/
	}
	
	
	}

