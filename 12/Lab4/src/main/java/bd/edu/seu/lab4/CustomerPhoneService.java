package bd.edu.seu.lab4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class CustomerPhoneService {
    public List<Customer> readCustomerPhones(String filename,
                                             List<Customer> customers) {

        try {
            RandomAccessFile inputFile = new RandomAccessFile(filename, "r");

            String line;
            while ((line = inputFile.readLine()) != null) {
                String[] tokens = line.split(",");

                int customerId = Integer.parseInt(tokens[0]);

                int countryCode = Integer.parseInt(tokens[1]);
                int areaCode = Integer.parseInt(tokens[2]);
                int number = Integer.parseInt(tokens[3]);

                Phone phone = new Phone(countryCode, areaCode, number);

                Customer customer = getCustomer(customerId, customers);
                customer.getPhones().add(phone);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customers;
    }

    // find the customer in "customers" list with the matching customerId
    private Customer getCustomer(int customerId, List<Customer> customers) {
        for (Customer customer : customers)
            if (customerId == customer.getId())
                return customer;

        return null;
    }
}
