#include<iostream>
using namespace std;
#pragma pack(1)

template<class T>
struct node
{
    T data;
    struct node *next;
};


template<class T>
class SinglyLL
{
    public:
        // Characteristics
        struct node<T> * First;
        int iCount;

        // Behaviours
        SinglyLL();

        void InsertFirst(T no);
        void InsertLast(T no);
        void InsertAtPosition(T no ,int ipos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPosition(int ipos);

        void Display();
};

/*
Return_Value Class_Name :: Function_Name(Parameters)
{

}
*/

template<class T>
SinglyLL<T> :: SinglyLL()
{
    First = NULL;
    iCount = 0;
}

template<class T>
void SinglyLL<T> :: InsertFirst(T no)
{
    // Step1 : Allocate memory for node
    struct node<T> * newn = new node<T>;

    // Step2 : Initialise node
    newn->data = no;
    newn->next =  NULL;

    // Step3 : Check if LL is empty or not
    if(First == NULL)   // if(iCount == 0)
    {
        First = newn;
        iCount++;
    }
    else    // If LL contains atleast one node
    {
        newn->next = First;
        First = newn;
        iCount++;
    }
}

template<class T>
void SinglyLL<T> :: InsertLast(T no)
{
    // Step1 : Allocate memory for node
    struct node<T> * newn = new node<T>;

    // Step2 : Initialise node
    newn->data = no;
    newn->next =  NULL;

    // Step3 : Check if LL is empty or not
    if(First == NULL)   // if(iCount == 0)
    {
        First = newn;
        iCount++;
    }
    else    // If LL contains atleast one node
    {
        struct node<T> * temp = First;

        while(temp->next != NULL)
        {
            temp = temp -> next;
        }
        temp->next = newn;
        iCount++;
    }
}

template<class T>
void SinglyLL<T> :: InsertAtPosition(T no, int ipos)
{
    if((ipos < 1) || (ipos > iCount+1))
    {
        cout<<"Invalid position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        InsertFirst(no);
    }
    else if(ipos == iCount + 1)
    {
        InsertLast(no);
    }
    else
    {
        struct node<T> * newn = new node<T>;

        newn->data = no;
        newn->next = NULL;

        struct node<T> * temp = First;
        for(int iCnt = 1; iCnt < ipos-1; iCnt++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

        iCount++;
    }
}

template<class T>
void SinglyLL<T> :: DeleteFirst()
{
    if(First == NULL)   // if(iCount == 0)
    {
        return;
    }
    else if(First -> next == NULL) // else if(iCount == 1)
    {
        delete First;
        First = NULL;
        iCount--;
    }
    else
    {
        struct node<T> * temp = First;
        First = First -> next;
        delete temp;
        iCount--;
    }
}

template<class T>
void SinglyLL<T> :: DeleteLast()
{    
    if(First == NULL)   // if(iCount == 0)
    {
        return;
    }
    else if(First -> next == NULL) // else if(iCount == 1)
    {
        delete First;
        First = NULL;
        iCount--;
    }
    else
    {
        struct node<T> * temp = First;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }

        delete temp->next;
        temp->next = NULL;

        iCount--;
    }
}

template<class T>
void SinglyLL<T> :: DeleteAtPosition(int ipos)
{
    if((ipos < 1) || (ipos > iCount))
    {
        cout<<"Invalid position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        DeleteFirst();
    }
    else if(ipos == iCount)
    {
        DeleteLast();
    }
    else
    {
        struct node<T> * temp1 = First;

        for(int iCnt = 1; iCnt < ipos-1; iCnt++)
        {
            temp1 = temp1->next;
        }

        struct node<T> * temp2 = temp1->next;

        temp1->next = temp2->next;
        delete temp2;

        iCount--;
    }
}

template<class T>
void SinglyLL<T> :: Display()
{
    cout<<"Elements of Linked List are : "<<"\n";
    struct node<T> * temp = First;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" |->";
        temp = temp->next;
    }
    cout<<"NULL"<<"\n";
}

int main()
{
    SinglyLL <int>iobj;
    
    iobj.InsertFirst(51);
    iobj.InsertFirst(21);
    iobj.InsertFirst(11);

    iobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<iobj.iCount<<"\n";

    iobj.InsertLast(101);
    iobj.InsertLast(111);
    iobj.InsertLast(121);
    iobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<iobj.iCount<<"\n";
    
    iobj.InsertAtPosition(105,5);
    iobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<iobj.iCount<<"\n";
    
    iobj.DeleteAtPosition(5);
    iobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<iobj.iCount<<"\n";
    
    iobj.DeleteFirst();
    iobj.DeleteLast();

    iobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<iobj.iCount<<"\n";

    cout<<"Singly linked list for double ";

    SinglyLL <double>dobj;
    
    dobj.InsertFirst(51.52);
    dobj.InsertFirst(21.22);
    dobj.InsertFirst(11.12);

    dobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<dobj.iCount<<"\n";

    dobj.InsertLast(101.102);
    dobj.InsertLast(111.103);
    dobj.InsertLast(121.104);
    dobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<dobj.iCount<<"\n";
    
    dobj.InsertAtPosition(105.50,5);
    dobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<dobj.iCount<<"\n";
    
    dobj.DeleteAtPosition(5);
    dobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<dobj.iCount<<"\n";
    
    dobj.DeleteFirst();
    dobj.DeleteLast();

    dobj.Display();
    cout<<"Number of nodes in first linkedlist are : "<<dobj.iCount<<"\n";
    
    return 0;
}