package L2;

public class Account {

    // declaring properties
    // variables inside class called properties
    private String name;
    private double balance;
    // create constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    // add the amount given to the balance
    public void deposit (double amount) {
        balance += amount;
        // or balance = balance + amount;

    }

}
