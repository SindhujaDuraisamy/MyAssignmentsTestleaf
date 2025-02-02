package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array {1, 2, 3, 4, 10, 6, 8}. 
		List<Integer> list1=Arrays.asList(1, 2, 3, 4, 10, 6, 8);
		
		//- Arrange the collection in ascending order 
		Collections.sort(list1);
		
		//Finding the size of the list
		int listSize = list1.size();
		System.out.println("The size of the list is: "+listSize);
		//System.out.println(list1.get(listSize-1));
		//- Inside the loop, check the current element + 1 is not equal to the next element.
		for (int i = 0; i <= list1.size() - 2; i++)
		{
			int currentElement = list1.get(i);
			int nextElement = list1.get(i + 1);
			if (nextElement != currentElement + 1) 
			{
			System.out.println(currentElement + 1);
			}
		//- Do a comparison check if there is a gap in the sequence of numbers. - Print the numbers that are missing.
		
		
		//- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if there is a gap in the sequence of numbers - Use the get() method to get an element from the list - Print the number if a gap is detected.

		}
	}

}
