package AkshaySir;



public class calcualteGrade {

	public static void main(String[] args) 
	{
		int sub1=56;
		int sub2=76;
		int sub3=87;
		int sub4=98;
		int sub5=97;
	   
		
		
		int sum=sub1+sub2+sub3+sub4+sub5;
		System.out.println("sum is : "+sum);
		
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
