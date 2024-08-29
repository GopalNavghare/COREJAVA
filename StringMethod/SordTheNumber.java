package StringMethod;

public class SordTheNumber 
{

	public static void main(String[] args) {
		String s1="87654";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char ca=ch[i];
					ch[i]=ch[j];
					ch[j]=ca;
				}
			}
		}
		for(char c:ch)
		{
			System.out.print(c+" ");
		}

	}

}