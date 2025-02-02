package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		List<String> companiesList=Arrays.asList("HCL", "Wipro", "Aspire Systems", "CTS");
		
		//Sorting the above list
		Collections.sort(companiesList);
		int companieslistSize = companiesList.size();
		for(int i=companieslistSize-1;i>=0;i--)
		{
			String reversedcompaniesList = companiesList.get(i); 
			System.out.println(reversedcompaniesList);
		}
		
		
		//Add the collection to a list Iterate the values in the list Print the required output as Wipro, HCL, CTS, Aspire Systems

	}

}
