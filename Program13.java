import java.util.*;

public class Program13
{


	public static boolean DivisibleByThreeAndFive(int iNo)
	{
		if(iNo % 3 == 0)
		{
			if(iNo % 5 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}

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
		
		boolean iRet = DivisibleByThreeAndFive(iValue);

		if(iRet == false)
		{
			System.out.println(iValue + " is not divisible by 5 & 3");
		}
		else
		{
			System.out.println(iValue + " is divisible by 5 & 3");
		}
				

	}

}