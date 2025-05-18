
public class BankAccount {
    public static final BankAccount EMPTY = new BankAccount(0, null, 0);
    public static String filepath = "account.csv";

    public int accountNumber;
    public String accountName;
    public float accountBalance;

    public BankAccount(int accountNumber, String accountName, float accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}