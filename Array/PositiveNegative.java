package Array;

public class PositiveNegative {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,-1,3,53,-3};
		int b[]=new int [a.length];
		for(int i=0;i<b.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
