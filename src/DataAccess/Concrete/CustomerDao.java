package DataAccess.Concrete;

import Entities.Customer;

import java.util.List;

public class CustomerDao implements DataAccess.Abstract.CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Veri Tabanına Yeni Kullanıcı Eklendi " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer, int id) {
        System.out.println("Veri Tabanında " + id+"Kullanıcı : "+ customer.getFirstName()+ "Güncllendi");
    }

    @Override
    public void delete(int id) {
        System.out.println("Veri Tabanından silindi" + id );
    }

    @Override
    public List<Customer> get() {
        // TODO Auto-generated method stub
        return null;
    }
}
