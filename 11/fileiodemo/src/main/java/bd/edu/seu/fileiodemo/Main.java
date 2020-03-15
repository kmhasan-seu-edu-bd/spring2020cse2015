package bd.edu.seu.fileiodemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public Main() {
        writeToFile();
    }

    private void writeToFile() {
        try {
            RandomAccessFile outputFile = new RandomAccessFile("accounts.txt", "rw");
            long length = outputFile.length();
            outputFile.seek(length);
            outputFile.writeBytes("CSE2016\n");
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
