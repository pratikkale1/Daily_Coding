package javatest;

public class NegativeBalanceException extends Exception {//NegativeBalanceException class is created
    public NegativeBalanceException(String message) { //message passed 
        super(message);
    }
}
