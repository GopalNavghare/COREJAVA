package AkshaySir;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		int num1=35;
		int num2=56;
		int num3=45;
		
		if(num1>num2 &&num1>num3)
		{
			System.out.println("Num1 is max");
			if(num2<num3)
				System.out.println("num2  is min");
			else
				System.out.println("num3 is min");
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("num2 is max");
			if(num1<num3)
				System.out.println("num1  is min");
			else
				System.out.println("num3 is min");
		}
		else
		{
			System.out.println("num3 is max");
		    if(num1<num2)
		    	System.out.println("num1  is min");
		    else
		    	System.out.println("num2 is min");
		}
	}

}
