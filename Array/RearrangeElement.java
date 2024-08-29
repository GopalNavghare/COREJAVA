package Array;

public class RearrangeElement 
{

	public static void main(String[] args) {
		int a[]= {1,2,2,1};
		
		for(int i=1;i<a.length;i++)
		{
			if(i%2==0&& a[i]<=a[i-1])
			{
			}
			else if(i%2!=0&&  a[i]>=a[i-1])
			{	
			}
			else
			{
				int temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
		}
		for(int num:a)
		{
			System.out.print (num+" ");
		}
	}
}
