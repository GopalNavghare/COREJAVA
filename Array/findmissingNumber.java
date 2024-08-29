package Array;


public class findmissingNumber 
{

	public static void main(String[] args) 
	{
		int n=4;
		int a[]= {1,4,3};
		for(int num=1;num<=n;num++)
		{
			if(!vaibhav(a,num))
			{
				System.out.println("Missing number "+num);
			    break;
			}
		}
	}
	public static boolean vaibhav(int a[],int num)
	{
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==num)
				return true;
		}
		return false;
	}
	
} 
