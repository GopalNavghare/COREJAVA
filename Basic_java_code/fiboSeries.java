package AkshaySir;

public class fiboSeries {

	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int sum=0;
		int num=10;
		System.out.print(num1+" "+num2+" ");
		for(int i=1;i<=num;i++)
		{
			sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
	}

}
