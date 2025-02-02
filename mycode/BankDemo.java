package mycode;
class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
    }
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + ". New balance: Rs." + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public synchronized int getBalance() {
    	return balance;
    }
}
public class BankDemo {
    public static void main(String[] args) {
    	System.out.println("The program is done by vishal gupta, roll no 118");
        BankAccount account = new BankAccount(1000);
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        });
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200);
            }
        });
        depositThread.start();
        withdrawThread.start();
        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance: Rs." + account.getBalance());
    }
}
