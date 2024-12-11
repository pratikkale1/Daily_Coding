// abstract class is a class which contains 0 or more abstract method in it
// Abstract class achives 0 to 100% acstraction
// We can also write constructor in abstarct class

abstract class Arithematic{

    public int Addition(int a , int b){
        return a+b;

    }

    public abstract int Substraction(int a, int b);
}

class Marvellous extends Arithematic{

    public int Substraction(int a,int b)
    {
        return a-b;
    }
}

class AbstractDemo
{
    public static void main(String[] args) {
        
       // Arithematic aobj = new Arithematic(); // NA
        Arithematic aobj = new Marvellous(); // Allowed
       Marvellous mobj = new Marvellous(); // Allowed

       int iRet = 0;

       iRet = mobj.Addition(11,10);
       System.out.println("Addition is : "+iRet);

       iRet = mobj.Substraction(11,10);
       System.out.println("Substraction is :- "+iRet);

    
    }
}

