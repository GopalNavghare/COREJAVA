package AkshaySir;

public class KaprekarNumber {

	public static void main(String[] args) 
	{
		int num=45;
		int square=num*num;
		int temp=square;
		int countDigit=0;
		while(square>0)
		{
		
			square=square/10;
			countDigit++;
		}
		
	int quotient=0,remainder=0,sum=0;
	
	for(int i=1;i<countDigit;i++)
	{
		int divisor=(int)Math.pow(10,i);
		quotient=temp/divisor;
		remainder=temp%divisor;
		sum=quotient+remainder;
	}
	if(sum==temp)
	{
		System.out.println("Is kaprekar number");
	}
	else
		System.out.println("Not kaprekar number");
	}
}
