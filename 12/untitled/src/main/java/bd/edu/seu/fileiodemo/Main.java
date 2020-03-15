package bd.edu.seu.fileiodemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public Main() {
        readFile();
    }

    public void readFile() {
        try {
            RandomAccessFile inputFile = new RandomAccessFile("account.txt", "r");
            String line;
            while ((line = inputFile.readLine()) != null) {
                System.out.println(line);
            }
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

    public static void main(String args[]) {
        new Main();
    }
}
