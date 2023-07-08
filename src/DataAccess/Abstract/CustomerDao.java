package DataAccess.Abstract;

import Entities.Customer;

import java.util.List;

public interface CustomerDao {
    void add(Customer customer);

    void update(Customer customer, int id);

    void delete(int id);

    List<Customer> get();

}