//Accept input from user and multiply using function/Method

import java.util.*;

class Program7
{


    public static int Multiplication(int iValue1,int iValue2)
    {
        int iAns = 0;

        iAns = iValue1 * iValue2;

        return iAns ;

    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iMult = 0;

        System.out.println("Enter First Number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        iMult = Multiplication(iNo1,iNo2);

        System.out.println("First Number is : " + iMult);
        


    }
}