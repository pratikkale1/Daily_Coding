// Addition of two number using method / function

import java.util.*;

class Program4
{

    public static int Additionx(int i,int j)
    {
         int iAns = 0;

        iAns = i + j;

        return iAns;
    }

    public static void main(String Arr[])
    {
        

        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iRet = 0;

        System.out.println("Enter First Number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        iRet = Additionx(iNo1,iNo2);

        System.out.println("Addition is " + iRet);


    }
}