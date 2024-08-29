package StringMethod;

public class ReverseEVeryword {

	public static void main(String[] args) {
		String s1="Hef,Shine";
		String[] s2=s1.split(",");
		System.out.println(s2.length);
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			String s3="";
			for(int j=0;j<temp.length();j++)
			{
				s3=s3+temp.charAt(j);
				
			}
	
		s2[i]=s3;
		System.out.print(s2[i]+" ");
		}
//		for(int i=0;i<s2.length;i++)
//		{
//			System.out.print(s2[i]+" ");
//		}
	}

} 
