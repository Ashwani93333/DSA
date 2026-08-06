import OOPs.Encapsulation.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        BankAccount account =
                new BankAccount(
                        1234567890L,
                        "Ashwani Kumar",
                        10000
                );

        account.displayAccountDetails();

        System.out.println();

        account.deposit(5000);

        account.withdraw(3000);

        account.withdraw(25000);

        account.setAccountHolder("Rahul Sharma");

        System.out.println();

        System.out.println("Current Balance : ₹" + account.getBalance());

        account.displayAccountDetails();
    }

}