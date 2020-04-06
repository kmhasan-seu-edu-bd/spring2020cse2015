package bd.edu.seu.lab4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> readCustomers(String filename) {
        List<Customer> customers = new ArrayList<>();

        try {
            RandomAccessFile inputFile = new RandomAccessFile(filename, "r");

            String line;
            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];

                Customer customer = new Customer(id, name);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customers;
    }
}
