//Accept input from user and multiply it 

import java.util.*;

class Program6
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iMult = 0;

        System.out.println("Enter First Number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        iMult = iNo1 * iNo2;

        System.out.println("First Number is : " + iMult);
        


    }
}