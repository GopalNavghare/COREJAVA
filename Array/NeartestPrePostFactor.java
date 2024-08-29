package Array;
import java.util.*;
public class NeartestPrePostFactor
{

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the size of array : ");
				int size = sc.nextInt();
				int arr[]= new int[size];
				for(int i =0; i<size; i++) 
				{
					arr[i]=sc.nextInt();
				}
				for(int i =0; i<size; i++) 
				{
					int num=arr[i];
					int preNum=arr[i];
					for(int j=1;; j++)
					{
						num++;
						preNum--;
						boolean isPresent=checkPrimeFactor(num,arr[i],preNum);
						if(isPresent) 
						{
							System.out.println(preNum+"  "+arr[i]+" "+num);
							break;
						}
					}	
				}	
			}
			
			public static boolean checkPrimeFactor(int num1, int num2,int preNum)
			{
				int min= Math.min(num1, num2);
				for(int i=2; i<min;i++) 
				{
					if(num1%(i+1)==0 && num2%(i)==0 && preNum%(i)==1) {
					return true;
				}
			}
			return false;
		}
		
	}

