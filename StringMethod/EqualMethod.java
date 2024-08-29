package StringMethod;

public class EqualMethod 
{

	public static void main(String[] args) {
		String s1="hello"; //case1
		String s2="hello";
		System.out.println(s1==s2);
		boolean result=s1.equals(s2); 
		System.out.println(result);
		
		System.out.println();
		
		String s3=new String("hello");//case2
		String s4=new String("hello");
		System.out.println(s3==s4);
		boolean res=s3.equals(s4); 
		System.out.println(res);
		
	}

}
