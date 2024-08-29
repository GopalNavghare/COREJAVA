package StringMethod;

public class StringToArray 
{

	public static void main(String[] args) 
	{
		box o=new box();
		box  o1=new box();
		
		o.height=1;
		o1=o;
		System.out.println(o1.height);
//		String s1="Hefshine";
//		
//		int length=s1.length();
//		char []a=new char[length];
//		
//		for(int i=0;i<length;i++)
//		{
//			a[i]=s1.charAt(i);
//		}
//		for(char ch:a)
//		{
//			System.out.println(ch);
//		}
	}

}
class box
{
	int height;
	int a;
}
