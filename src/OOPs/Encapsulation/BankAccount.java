package OOPs.Encapsulation;

public class BankAccount {

    // ==========================
    // Private Data Members
    // ==========================

    private long accountNumber;
    private String accountHolder;
    private double balance;

    // ==========================
    // Constructor
    // ==========================

    public BankAccount(long accountNumber,
                       String accountHolder,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // ==========================
    // Getters
    // ==========================

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // ==========================
    // Setters
    // ==========================

    public void setAccountHolder(String accountHolder) {

        if(accountHolder != null && !accountHolder.isBlank()){
            this.accountHolder = accountHolder;
        }else{
            System.out.println("Invalid Name.");
        }
    }

    // ==========================
    // Business Methods
    // ==========================

    public void deposit(double amount){

        if(amount <= 0){
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;

        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount){

        if(amount <= 0){
            System.out.println("Invalid Amount.");
            return;
        }

        if(amount > balance){
            System.out.println("Insufficient Balance.");
            return;
        }

        balance -= amount;

        System.out.println("₹" + amount + " withdrawn successfully.");
    }

    // ==========================
    // Display Details
    // ==========================

    public void displayAccountDetails(){

        System.out.println("\n========= Account Details =========");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);

        System.out.println("===================================");
    }
}
