package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] array= {1,4,3,2,8,6,7};
		Arrays.sort(array);
		//System.out.println(Arrays.sort(array));
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=i+1)
			{
				System.out.println("Missing no is :"+(i+1));
				break;
			}
			
		}
		
		
		
		
		
	}
}
