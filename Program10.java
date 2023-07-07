import java.util.*;

public class Program10
{


	public static boolean DivisibleByFive(int iNo)
	{
		int iAns = 0;

		iAns = iNo % 5;

		if(iAns == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int iValue = sobj.nextInt();
		
		boolean iRet = DivisibleByFive(iValue);

		if(iRet == false)
		{
			System.out.println(iValue + " is not divisible by 5");
		}
		else
		{
			System.out.println(iValue + " is divisible by 5");
		}


		
		
				

	}

}