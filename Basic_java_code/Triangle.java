package AkshaySir;

public class Triangle {

	public static void main(String[] args) 
	{
		int side1=22;
		int side2=22;
		int side3=23;
		
		if(side1==side2 && side2==side3 && side1==side3)
			
		{
			System.out.println("Equilateral Triangle");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		
		{
		System.out.println("Isosceles triangle");
		}
		else
			System.out.println("Scalence Triangle");
	}

}
