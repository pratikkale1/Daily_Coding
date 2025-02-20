

interface Demo
{
    void fun();
}
interface Hello extends Demo
{
    void gun();
}
class Marvellous implements Hello
{
    public void fun() // In interface all method and charcteristics are implicitly public                     
    {}                // but in class we have declare it public explicitly
    public void gun()
    {}
}






