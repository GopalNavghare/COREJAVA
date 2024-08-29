package AkshaySir;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Day :");
		int day =sc.nextInt();
		sc.close();
		
		switch(day)
		{
		case 1: System.out.println("Monday");
			break;
		case 2: System.out.println("tuesday");
			break;
		case 3: System.out.println("wednsday");
			break;
		case 4: System.out.println("thursday");
			break;
		case 5: System.out.println("friday");
			break;
		case 6: System.out.println("saturday");
			break;
		case 7: System.out.println("sunday");
			break;
		default :System.out.println("there are only 7 dayss in week....");
		}
	}

}
