//Accept input from user and check that number is divisible by 5 by boolean(true or false)

import java.util.*;

class Program10
{


    public static boolean DivisibleByFive(int iValue)
    {
        int iAns = 0;
    

        iAns = iValue % 5;

        if (iAns == 0) 
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter Number");
        iNo = sobj.nextInt();

        bRet = DivisibleByFive(iNo);

        if(bRet == false)
        {
            System.out.println(+ iNo + " is not divisible by 5");
        }
        else{
            System.out.println(+ iNo + " is  divisible by 5");
        }

        


    }
}