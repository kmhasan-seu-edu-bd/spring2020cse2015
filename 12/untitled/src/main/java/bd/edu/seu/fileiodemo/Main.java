package bd.edu.seu.fileiodemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public Main() {
        readFromFileStoreInArrayList();
//        writeToFile();
//        bankAccountDemo();
    }

    private void bankAccountDemo() {
        BankAccount account = new BankAccount(354, "John Doe", 5775);
        System.out.println(account.toString());
    }

    public void writeToFile() {
        try {
            RandomAccessFile outputFile = new RandomAccessFile("accounts.txt", "rw");

            long length = outputFile.length();
            outputFile.seek(length);

            outputFile.writeBytes("Hello everyone!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFileStoreInArray() {
        try {
            RandomAccessFile inputFile = new RandomAccessFile("accounts.txt", "r");
            String line;

            BankAccount accounts[] = new BankAccount[1_000_000];

            int index = 0;
            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");

                int number = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double balance = Double.parseDouble(tokens[2]);
                BankAccount account = new BankAccount(number, name, balance);

                accounts[index] = account;
                index = index + 1;
            }

//            for (int i = 0; i < accounts.length; i++)
//                if (accounts[i] != null)
//                    System.out.println(accounts[i]);

            // enhanced for loop (Java 1.5)
            for (BankAccount a : accounts)
                if (a != null)
                    System.out.println(a);

//            while (true) {
//                line = inputFile.readLine();
//                if (line == null)
//                    break;
//                System.out.println(line);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFileStoreInArrayList() {
        try {
            RandomAccessFile inputFile = new RandomAccessFile("accounts.txt", "r");
            String line;

            ArrayList<BankAccount> accounts = new ArrayList<>();

            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");

                int number = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double balance = Double.parseDouble(tokens[2]);
                BankAccount account = new BankAccount(number, name, balance);

                accounts.add(account);
            }

            // enhanced for loop (Java 1.5)
            for (BankAccount account : accounts)
                System.out.println(account);

            // HW: Find out who has the least balance (aka who is the poorest)

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        new Main();
    }
}
