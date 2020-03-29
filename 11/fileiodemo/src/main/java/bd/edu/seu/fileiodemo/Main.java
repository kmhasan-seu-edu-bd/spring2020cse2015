package bd.edu.seu.fileiodemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList; // import != include

public class Main {
    public Main() {
        //writeToFile();
//        readFromFileStoreInArray();
        readFromFileStoreInArrayList();
//        bankAccountDemo();
    }

    private void bankAccountDemo() {
        BankAccount bankAccount = new BankAccount(1234, "John Doe", 1000);
        System.out.println(bankAccount.toString());
    }

    private void readFromFileStoreInArray() {
        try {
            System.out.println("Trying to read from accounts.txt");
            RandomAccessFile inputFile = new RandomAccessFile("accounts.txt", "r");

            String line;

/*
            while (true) {
                line = inputFile.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
*/
            final int MAX_ELEMENTS = 1_000_000;
            BankAccount accounts[] = new BankAccount[MAX_ELEMENTS];

            int index = 0;
            while ((line = inputFile.readLine()) != null) {
                //System.out.println(line);
                String[] tokens = line.split(",");
                int number = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double balance = Double.parseDouble(tokens[2]);

                BankAccount bankAccount = new BankAccount(number, name, balance);
                accounts[index] = bankAccount;
                index++;
//                System.out.println(bankAccount);
            }

//            for (int i = 0; i < MAX_ELEMENTS; i++)
//                if (accounts[i] != null)
//                    System.out.println(accounts[i]);

            // extended/enhanced for loop
            for (BankAccount account : accounts)
                if (account != null)
                    System.out.println(account);

        } catch (FileNotFoundException e) {
            System.err.println("accounts.txt file does not exist!");
        } catch (IOException e) {
            System.err.println("Some I/O exception occurred!");
        }

    }

    private void readFromFileStoreInArrayList() {
        try {
            System.out.println("Trying to read from accounts.txt");
            RandomAccessFile inputFile = new RandomAccessFile("accounts.txt", "r");

            String line;

            ArrayList<BankAccount> accounts = new ArrayList<>();

            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");
                int number = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double balance = Double.parseDouble(tokens[2]);

                BankAccount bankAccount = new BankAccount(number, name, balance);
                accounts.add(bankAccount);
            }

//            for (int i = 0; i < accounts.size(); i++)
//                System.out.println(accounts.get(i));

            // extended/enhanced for loop (Java 1.5)
            for (BankAccount account : accounts)
                System.out.println(account);

            // HW: calculate the sum of all the balances
        } catch (FileNotFoundException e) {
            System.err.println("accounts.txt file does not exist!");
        } catch (IOException e) {
            System.err.println("Some I/O exception occurred!");
        }

    }

    private void writeToFile() {
        try {
            RandomAccessFile outputFile = new RandomAccessFile("accounts.txt", "rw");
            long length = outputFile.length();
            outputFile.seek(length);
            outputFile.writeBytes("Online class\n");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("accounts.txt file does not exist!");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Could not write to file!");
        }
    }

    public static void main(String args[]) {
        new Main();
    }
}
