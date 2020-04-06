package bd.edu.seu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class BankAccountsService {
    public List<BankAccount> readBankAccounts(String filename) {
        List<BankAccount> bankAccounts = new ArrayList<>();

        try {
            RandomAccessFile inputFile = new RandomAccessFile(filename, "r");

            String line;
            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                String address = tokens[2];
                double balance = Double.parseDouble(tokens[3]);

                BankAccount bankAccount = new BankAccount(id, name, address, balance);
                bankAccounts.add(bankAccount);
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bankAccounts;
    }

    public void writeBankAccounts(String filename, List<BankAccount> accounts) {
        try {
            RandomAccessFile outputFile = new RandomAccessFile(filename, "rw");
            outputFile.setLength(0);

            for (BankAccount account : accounts) {
                String record = account.getNumber() + ","
                        + account.getName() + ","
                        + account.getAddress() + ","
                        + account.getBalance() + "\n";
                outputFile.writeBytes(record);
            }

            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
