package Business.Abstract;

import Entities.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);

    void update(Customer customer, int id);

    void delete(int id);

    List<Customer> get();

}
