package AkshaySir;

import java.util.*;

public class calculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter Operator :");
		char operator=sc.next().charAt(0);
		sc.close();
		
		
		if(operator=='+')
			System.out.println("Addition is :"+(num1+num2));
		else if(operator=='-')
			System.out.println("Subtraction is: "+(num1-num2));
		else if(operator=='*')
			System.out.println("Multiply is :"+(num1*num2));
		else if(operator=='/')
			System.out.println("divide is :"+(num1/num2));
		else if(operator=='%')
			System.out.println("modulus is : "+(num1%num2));
		else
			System.out.println("Wrong operator entered");
		
	}

}
