package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//- Declare an array {3, 2, 11, 4, 6, 7}. 
		
		List<Integer> list= Arrays.asList(3, 2, 11, 4, 6, 7);
				
		//- Pick the 2nd element from the last and print it.
		Collections.sort(list);
		// Finding the size of the list
		int listSize = list.size();
		//The 2nd element from the last is as below
		System.out.println("The 2nd element from the last is: "+list.get(listSize-2));
	}

}
