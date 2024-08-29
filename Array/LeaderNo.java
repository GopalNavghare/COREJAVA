package Array;

public class LeaderNo {

	public static void main(String[] args)
	{
		int []a= {4,1,7,8,1,8,3,4};
		System.out.println("Leader No:");
		for(int i=0;i<a.length;i++)  
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
