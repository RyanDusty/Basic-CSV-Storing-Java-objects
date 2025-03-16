import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String CSV_FILE = "account.csv";
    public static void main(String[] args) {
        // File creation
        File file = new File(CSV_FILE);
        if(file.exists()) {

        }
        // Instance of class objectClass
        System.out.println("Account Details:");
            System.out.println("What's your balance?");
        Scanner Balance = new Scanner(System.in);
            float Bal = Balance.nextFloat();
        BankAccount instance = BankAccount.EMPTY;
            instance.setAccountBalance(Bal);
        Float balance = instance.getAccountBalance();
            System.out.println(Bal);
        // Account number system
        System.out.println("What's your account number?");
            Scanner num = new Scanner(System.in);
        int number = num.nextInt();
            instance.setAccountNumber(number);
        int accountnum = instance.getAccountNumber();
            System.out.println(accountnum);
        // Account name system
        System.out.println("What's your accounts name?");
            Scanner name = new Scanner(System.in);
        String nam = name.next();
            instance.setAccountName(nam);
        String accountname1 = instance.getAccountName();
            System.out.println(accountname1);

    }
}