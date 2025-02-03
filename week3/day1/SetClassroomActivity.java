package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class SetClassroomActivity {
	
		public static void main(String agrs[])
		{
			String companyName="google";
			char[] companyArray = companyName.toCharArray();
			System.out.println(companyArray);
			Set<Character> unique=new HashSet<Character>();
			System.out.println("Before:"+unique);
			//companyArray.length()
			for(int i=0;i<companyArray.length;i++)
			{
				unique.add(companyArray[i]);
			}
			System.out.println("After:"+unique);
		}
	

}
