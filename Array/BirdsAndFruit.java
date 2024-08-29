package Array;

public class BirdsAndFruit {

	public static void main(String[] args) {
		int a[]= {2,1,3,5,0,1,4};
		int m=3;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int j=i;
			int sum=0;
			for(int x=0;x<m;x++)
			{
				if(j>=a.length)
				{
					j=0;
				}
				sum=sum+a[j];
				j++;
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}

}
