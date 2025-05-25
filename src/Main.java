import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSV csv = new CSV();
        BankAccount instance = new BankAccount(0, "", 0);
        if(BankAccount.filepath == null) {
            System.out.println("File path is not set, creating a new file.");
            csv.createCSVFile(BankAccount.filepath);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Account Number: ");
            int accountNumber = scanner.nextInt();
            instance.setAccountNumber(accountNumber);

            System.out.println("Enter Account Name: ");
            String accountName = scanner.next();
            instance.setAccountName(accountName);


            System.out.println("Enter Account Balance: ");
            float accountBalance = scanner.nextFloat();
            instance.setAccountBalance(accountBalance);

            System.out.println("Updated Account:");
            System.out.println("Number: " + instance.getAccountNumber());
            System.out.println("Name: " + instance.getAccountName());
            System.out.println("Balance: " + instance.getAccountBalance());
            csv.saveToCSV(instance, BankAccount.filepath);
            System.out.println("Account saved to CSV file.");
            scanner.close();
        }
        else {

  
            System.out.println("File path is set.");
            csv.loadFromCSV(BankAccount.filepath);
            System.out.println("Account loaded from CSV file.");


            Scanner scanner = new Scanner(System.in);
          

            System.out.println("Do you want to update the account? (yes/no)");
            String yesno = scanner.next();  
            if (yesno.equalsIgnoreCase("yes")) {
                File file = new File(BankAccount.filepath);
                try {
                    boolean fileExists = file.exists();
                    if (fileExists) {
                        file.delete();
                        System.out.println("File deleted successfully.");
                        csv.createCSVFile(BankAccount.filepath);
                        System.out.println("Enter new Account Number: ");
                        int accountNumber = scanner.nextInt();
                        instance.setAccountNumber(accountNumber);

                        System.out.println("Enter new Account Name: ");
                        String accountName = scanner.next();
                        instance.setAccountName(accountName);

                        System.out.println("Enter new Account Balance: ");
                        float accountBalance = scanner.nextFloat();
                        instance.setAccountBalance(accountBalance); 

                        System.out.println("Updated Account:");
                        System.out.println("Number: " + instance.getAccountNumber()); 
                        System.out.println("Name: " + instance.getAccountName());
                        System.out.println("Balance: " + instance.getAccountBalance());
                        csv.saveToCSV(instance, BankAccount.filepath);

                        scanner.close(); 

                    }
            else{
                System.out.println("Here's your information:" +
                        "\nAccount Number: " + instance.getAccountNumber() +
                        "\nAccount Name: " + instance.getAccountName() +
                        "\nAccount Balance: " + instance.getAccountBalance()); }
            }
                catch (Exception e) {
                    System.out.println("Error registering new information. " + e.getMessage());
                }
                
                
            }
        }

        


        

    }
}
