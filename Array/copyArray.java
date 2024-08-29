package Array;

public class copyArray 
{

	public static void main(String[] args)
	{
		int[] a= {1,2,3,4};
		int[]b= new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			//b[i]=a[i]; 
			b=a;
			System.out.println(b[i]);
		}
//		for(int i=0;i<a.length;i++)
//		{
//				System.out.println(b[i]);
//		}
	}

}
