package StringMethod;

public class SortTheString {

	public static void main(String[] args) {
		String s1="Hello Welcome To The hefshine";
		String[] s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].length()>s2[j].length())
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		for(String s3:s2)
		{
			System.out.print(s3+" ");
		}
	}

}
