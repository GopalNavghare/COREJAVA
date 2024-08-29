package StringMethod;

import java.util.Scanner;

public class SimpleString 
{

	public static void main(String[] args) 
	{
		String str="hello";
		System.out.println(str);
		 
//		String str2=new String(str);
//		System.out.println(str2);
		
		
//		char[]ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.println(ch[i]);
//		}
		
		
//		char ch1;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a character");
//		ch1=sc.next().charAt(0);
//		System.out.println(ch1);
		
		String ch11;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a String");
		ch11=sc1.next();
		
		System.out.println(ch11.indexOf('a'));
		
	}

}
