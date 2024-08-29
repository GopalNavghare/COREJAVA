package Array;

public class CommenPrimeFactor {

	public static void main(String[] args) 
	{
		int num1=21;
		int num2=42;
		int result=Gopal(num1,num2);
		System.out.println(result);
	
	}
	public static int Gopal(int num1,int num2) 
	{
		int min=Math.min(num1, num2);
		
		int i=2;
		while(i<=min)
		{
			if(num1%i==0&&num2%i==0)
			{
				
				return i; 
			}
			else
				i++;
		}
		return -1;
		
		
//		for(int i=2;i<=min;i++)
//		{
//			if(num1%i==0&&num2%i==0) 
//			{
//				return i;
//			}
//			
//		}
//		return -1;
//			
	}

}
