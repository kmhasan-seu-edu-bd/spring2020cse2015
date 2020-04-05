package bd.edu.seu.lab4;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> readCustomers(String filename) {
        List<Customer> customers = new ArrayList<>();

        // TODO add your code here

        // TODO remove this dummy code
        // ---
        Customer a = new Customer(12, "John Doe");
        Customer b = new Customer(11, "Jane Doe");
        customers.add(a);
        customers.add(b);
        // ---

        return customers;
    }
}
