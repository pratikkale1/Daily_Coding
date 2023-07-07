import java.util.*;

public class Program12
{


	public static boolean DivisibleByThreeAndFive(int iNo)
	{
		int iAns1 = 0;
		int iAns2 = 0;

		iAns1 = iNo % 5;
		iAns2 = iNo % 3;


		if((iAns1 == 0) && (iAns2 == 0))
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