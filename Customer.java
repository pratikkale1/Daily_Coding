package javatest;

public class Customer {//Customer class is created
    private String aadhar; //aadhar data field is added 
    private String name;//name data field is added 
    private String address;//address data field is added 
    private Account account;//account data field is added 

    public Customer() {//default Constructor called
    }

    public Customer(String aadhar, String name, String address, Account account) {// Parameterized Constructor called
        this.aadhar = aadhar;
        this.name = name;
        this.address = address;
        this.account = account;
    }

    public String getAadhar() {// getter called for aadhar
        return aadhar;
    }

    public void setAadhar(String aadhar) {// setter called for aadhar
        this.aadhar = aadhar;
    }

    public String getName() {//getter called for name
        return name;
    }

    public void setName(String name) {// setter called for name
        this.name = name;
    }

    public String getAddress() {//getter called for address
        return address;
    }

    public void setAddress(String address) {// setter called for address
        this.address = address;
    }

    public Account getAccount() {//getter called for account
        return account;
    }

    public void setAccount(Account account) {// setter called for account
        this.account = account;
    }
}

