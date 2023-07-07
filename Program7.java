import java.util.*;

public class Program7 {


	public static int Multiplication(int iValue1 ,int iValue2){
		int iAns = 0;

		iAns = iValue1 * iValue2;

		return iAns;
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter 2nd number");
		
		int iNo2 = sobj.nextInt();
		
		int iMult = Multiplication(iNo1,iNo2);

		System.out.println("Multiplication is "+ iMult);

		
		
				

	}

}