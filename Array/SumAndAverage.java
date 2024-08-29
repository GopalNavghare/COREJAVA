package Array;

public class SumAndAverage 
{
	public static void main(String[] args) 
	{
		int []a= {22,23,55,12,54};
		int sum=0;
		int avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("sum :"+sum);
		System.out.println("avg :"+avg);
	}

}
