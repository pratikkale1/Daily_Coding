import java.util.*;

public class Program8 {


	public static int DivisibleByFive(int iNo)
	{
		int iAns = 0;

		iAns = iNo % 5;

		if(iAns == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int iValue = sobj.nextInt();
		
		int iRet = DivisibleByFive(iValue);

		if(iRet == 0)
		{
			System.out.println(iValue + " is not divisible by 5");
		}
		else
		{
			System.out.println(iValue + " is divisible by 5");
		}


		
		
				

	}

}