package Array;

public class FindIndexOfarray {

	public static void main(String[] args) 
	{
		
		int a[]= {12,34,63};
		int num=34;
		int Index=gopal(a,num);					
							
		if(Index==-1)
		{
			System.out.println("Not Found in array");
		}
		else 
		{
			System.out.println("Fount  in array "+Index);
		}
	}
	public static int gopal(int a[],int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				return i; 
			}
		}
		return -1;
	}

}
