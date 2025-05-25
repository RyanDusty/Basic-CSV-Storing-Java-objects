import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CSV {
    public Object loadFromCSV;


    public void saveToCSV(BankAccount account, String filepath) {
            try (FileWriter writer = new FileWriter(filepath, true)) {
                writer.write(
                        account.accountNumber + "," +
                                account.accountName + "," +
                                account.accountBalance + "\n"
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public void loadFromCSV(String filepath) {
    File file = new File(filepath);
    try (Scanner scanner = new Scanner(file)) {
        boolean isFirstLine = true; // Flag to skip header

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Skip the header line
            if (isFirstLine) {
                isFirstLine = false;
                continue; // Move to the next iteration
            }

            String[] data = line.split(",");
            int accountNumber = Integer.parseInt(data[0]);
            String accountName = data[1];
            float accountBalance = Float.parseFloat(data[2]);

            // Print or process the data
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Name: " + accountName);
            System.out.println("Balance: " + accountBalance);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
}

    
    public void createCSVFile(String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(filepath)) {
                writer.write("Account Number,Account Name,Account Balance\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}