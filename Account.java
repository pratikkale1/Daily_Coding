package javatest;

public class Account { //Account class is created
    private String accountType; // accountType data field is added 
    private String accountNumber;// accountNumber data field is added
    private double minimumBalance;// minimumBalance data field is added
    private double currentBalance;// currentBalance data field is added

    public Account() { //default Constructor called
    }

    // Parameterized Constructor called
    public Account(String accountType, String accountNumber, double minimumBalance, double currentBalance) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.minimumBalance = minimumBalance;
        this.currentBalance = currentBalance;
    }

    public String getAccountType() { // getter called for accountType
        return accountType;
    }

    public void setAccountType(String accountType) {// setter called for accountType
        this.accountType = accountType;
    }

    public String getAccountNumber() {// getter called for accountNumber
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {// setter called for accountNumber
        this.accountNumber = accountNumber;
    }

    public double getMinimumBalance() {// getter called for minimumBalance
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {// setter called for minimumBalance
        this.minimumBalance = minimumBalance;
    }

    public double getCurrentBalance() {// getter called for currentBalance
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {// setter called for currentBalance
        this.currentBalance = currentBalance;
    }

    public double calculateInterest() throws NegativeBalanceException {//calculateInterest method created to show Negative balance not allowed 
        double rate = 8.5;
        double time = 5;
        double interest = (currentBalance * rate * time) / 100; // 
        if (interest < 0) {// condition applied if interest is less than zero
            throw new NegativeBalanceException("Negative balance not allowed!");// throws NegativeBalanceException here
        }
        return interest; 
    }
}
