package AkshaySir;

public class Threenumbermax {

	public static void main(String[] args)
	{
		int num1=185;
		int num2=45; 
		int num3=24;
		
		
		if(num1>num2 &&num1>num3)
		{
			System.out.println("Num1 is max");
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("num2 is max");
		}
		else
			System.out.println("num3 is max");
		
		
		// for mininmum.
		if(num1<num2 &&num1<num3)
		{
			System.out.println("Num1 is min");
		}
		else if(num2<num1&&num2<num3)
		{
			System.out.println("num2 is min");
		}
		else
			System.out.println("num3 is min");


	}

}
