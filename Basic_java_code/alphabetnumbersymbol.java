package AkshaySir;

public class alphabetnumbersymbol
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch='1';
		
		if(ch>='A'&&ch<='Z')
			System.out.println("Uppercase");
		else if(ch>='a'&&ch<='z')
			System.out.println("lowercase");
		else if(ch>='0'&& ch<='9')
			System.out.println("Number");
		else
			System.out.println("Special Symbol");
	}// else without if 

}
