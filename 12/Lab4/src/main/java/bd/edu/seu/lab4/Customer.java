package bd.edu.seu.lab4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<Phone> phones;

    public Customer() {
        phones = new ArrayList<>();
    }

    public Customer(int id, String name) {
        this(); // calls the default constructor to get the phones list instantiated
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
