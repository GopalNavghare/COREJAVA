package Array;

public class EqualityoFArray 
{

	public static void main(String[] args) 
	{
		int[]a1= {1,4,3,6,3};
		int []a2={1,4,3,3,6 };
		
		if(a1.length==a2.length)
		{
			int cnt=0;
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=a2[i])
			   {
					cnt++;
			 		break;
			   }
			}
			if(cnt==0)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
		}
		else
			System.out.println("Not Equall");
	}

}
