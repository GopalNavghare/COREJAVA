package Array;

public class FindMaxElement 
{

	public static void main(String[] args) 
	{
		int a[]= {11,25,58,19,18};
		int max=a[0];
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
			
		}
		System.out.println(max);
	}
}
