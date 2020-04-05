package bd.edu.seu.lab4;

import java.util.List;

public class Main {
    private CustomerService customerService;
    private CustomerPhoneService customerPhoneService;

    public Main() {
        customerService = new CustomerService();
        customerPhoneService = new CustomerPhoneService();

        List<Customer> customers = customerService.readCustomers("customers.txt");
        customers = customerPhoneService.readCustomerPhones("phones.txt", customers);

        for (Customer customer : customers)
            System.out.println(customer);
    }

    public static void main(String args[]) {
        new Main();
    }
}
