package Business.Concrete;

import Business.Abstract.CustomerService;
import Core.MernisValidation.MernisValidationService;
import DataAccess.Abstract.CustomerDao;
import Entities.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    CustomerDao customerDao;
    MernisValidationService managerService;


    public CustomerManager(CustomerDao customerDao, MernisValidationService validationService) {
        super();
        this.customerDao = customerDao;
        this.managerService = validationService;
    }

    @Override
    public void add(Customer customer) {
        if(managerService.ifCheckRealUser(customer.getNationalId(), customer.getFirstName(), customer.getLastName(), customer.getBirthYear())) {
            System.out.println("Kullanıcı Doğrulandı");
            customerDao.add(customer);

        }
        else
        {
            System.out.println("Hatalı kullanıcı bilgileri");
        }
    }

    @Override
    public void update(Customer customer, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Customer> get() {
        return null;
    }
}
