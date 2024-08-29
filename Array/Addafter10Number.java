package Array;

public class Addafter10Number
{
	public static void main(String[] args) 
	{
		int []a= {12,23,32,54,};
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			for(int j=1;j<10;j++)
			{
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
