import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSV csv = new CSV();

        csv.createCSVFile(BankAccount.filepath);

        BankAccount instance = new BankAccount(0, "", 0);

        csv.saveToCSV(instance, BankAccount.filepath);

        csv.loadFromCSV(BankAccount.filepath);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Enter Account Name: ");
        String accountName = scanner.next();

        System.out.println("Enter Account Balance: ");
        float accountBalance = scanner.nextFloat();

        System.out.println("Updated Account:");
        System.out.println("Number: " + instance.getAccountNumber());
        System.out.println("Name: " + instance.getAccountName());
        System.out.println("Balance: " + instance.getAccountBalance());

    }
}
