package Array;

public class PrimeFactorOfNumber {

	public static void main(String[] args) {
		int num=42;
		int i=2;
		while(num>0)
		{
			if(num%i==0)
			{
				System.out.println(i);
				num=num/i;
			}
			else 
			{
				i++;
			}	
		}
	}
}
