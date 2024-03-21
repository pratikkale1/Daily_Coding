//Accept input from user basic

import java.util.*;

class Program5
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0 ;

        System.out.println("Enter First Number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number");
        iNo2 = sobj.nextInt();

        System.out.println("First Number is : " + iNo1);
        System.out.println("Second Number is : " + iNo2);


    }
}