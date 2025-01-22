package week1.day3;

import java.util.Arrays;

public class FindDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,5,6,8,9,2,5,6};
		int legthOfArray=numbers.length;
		Arrays.sort(numbers);
		for(int i=0;i<legthOfArray-1;i++)
		{
			//System.out.println(numbers[i]);
			if(numbers[i]==numbers[i+1])
			{
				System.out.println(numbers[i]);
			}
			
		}
		
	}

}
