package week1.day2;

public class LearnContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Continue will skip the current iteration alone and continue the rest
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
