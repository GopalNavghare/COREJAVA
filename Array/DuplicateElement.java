package Array;

public class DuplicateElement 
{
	public static void main(String[] args) 
	{

		int []a= {1,2,3,3,4,-2,4,3};
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
			  System.out.print(a[i]+" ");
			}
			
		}
		
	}
}