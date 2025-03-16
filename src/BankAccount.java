import java.io.FileWriter;
import java.io.IOException;

public class BankAccount {
    public static BankAccount EMPTY = new BankAccount(0, "null", 0);
      protected int accountNumber;
      protected String accountName;
      protected float accountBalance;
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
    public void saveToCSV(String filename) {
        try (FileWriter writer = new FileWriter("account.csv")) {
            writer.write(
                    accountNumber + "," +
                        accountName + "," +
                        accountBalance + "\n"
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
   // public static BankAccount loadFromCSV(String filename) {


    }
//}
