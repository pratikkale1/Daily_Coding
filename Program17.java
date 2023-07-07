import java.util.*;


public class Program17
{

	public static void Display(int iValue)
	{
		int iCnt = 0;
		for(iCnt = 1; iCnt <= iValue;iCnt++)
		{
			System.out.println("Jai Ganesh !!!");
		}
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);		

		System.out.println("Enter the Number of Interation");
		
		int iNo = sobj.nextInt();

		Display(iNo);
	}

}