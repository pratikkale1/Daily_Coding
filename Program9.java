//Accept input from user and check that number is divisible by 5 or not by exchanging if else

import java.util.*;

class Program9
{


    public static int DivisibleByFive(int iValue)
    {
        int iAns = 0;

        iAns = iValue % 5;

        if (iAns != 0) {
            return 1;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter Number");
        iNo = sobj.nextInt();

        iRet = DivisibleByFive(iNo);

        if(iRet != 0)
        {
            System.out.println(+ iNo + " is not divisible by 5");
        }
        else{
            System.out.println(+ iNo + " is  divisible by 5");
        }

        


    }
}