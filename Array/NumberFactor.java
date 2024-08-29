package Array;

public class NumberFactor {

	public static void main(String[] args)
	{
		
		int num=60;
		System.out.print("Factors of 60 are: ");
		
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				System.out.print(i+" ");
				
			}
			
		}
	}

}
