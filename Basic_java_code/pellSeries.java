package AkshaySir;

public class pellSeries {

	public static void main(String[] args) 
	{
		int limit=10;
		int a=0;
		int PreNum=1;
		int NewNum;
		
		System.out.print(a +"  "+PreNum+"   ");
		for(int i=1;i<=limit;i++)
		{
			NewNum=a+(2*PreNum);
			System.out.print(NewNum+"  ");
			a=PreNum;
			PreNum=NewNum;
		}
	}

}
