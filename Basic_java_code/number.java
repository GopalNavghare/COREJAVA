package AkshaySir;

public class number {

	public number() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
		System.out.println();
		
		int i=1;
		while(i<=20)
		{
			System.out.println(i);
			i++;
		}
		System.out.println();
		int j=1;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=20);
		int num=374;
		int year=num/365;
		System.out.println(year);
		int rem1=num%365;
		
		int month=rem1/30;
		System.out.println(month);
		int rem2=rem1%30;
		
		int week=rem2/7;
		System.out.println(week);
		int day=rem2%7;
		System.out.println(day);
		
		

	}

}
