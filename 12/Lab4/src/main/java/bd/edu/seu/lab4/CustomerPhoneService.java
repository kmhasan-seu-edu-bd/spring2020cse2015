package bd.edu.seu.lab4;

import java.util.List;

public class CustomerPhoneService {
    public List<Customer> readCustomerPhones(String filename,
                                             List<Customer> customers) {
        // TODO add your code here

        // TODO remove this dummy code
        // --
        Phone a = new Phone(88, 0, 1411433267);
        Phone b = new Phone(88, 0, 1921957882);
        Phone c = new Phone(88, 0, 1521477893);
        customers.get(0).getPhones().add(a);
        customers.get(0).getPhones().add(b);
        customers.get(1).getPhones().add(c);
        // --
        return customers;
    }
}
