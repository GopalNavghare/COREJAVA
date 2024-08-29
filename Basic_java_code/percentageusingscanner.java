package AkshaySir;

import java.util.Scanner;

public class percentageusingscanner 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter five sub marks: ");
	int sub1=sc.nextInt();
	int sub2=sc.nextInt();
	int sub3=sc.nextInt();
	int sub4=sc.nextInt();
	int sub5=sc.nextInt();
	
	int sum=sub1+sub2+sub3+sub4+sub5;
	System.out.println("Sum of sub : "+sum);
	
	double per =sum*100/500;
	System.out.println("percentage is : "+per);
	if(per>=90)
		System.out.println("Grade A");
	else if(per>=80)
		System.out.println("Grade B");
	else if(per>=70)
		System.out.println("Garde C");
	else if(per>=60)
		System.out.println("Grade D");
	else if(per>=40)
		System.out.println("Grade E");
	else
		System.out.println("Fail");
	
}
}
