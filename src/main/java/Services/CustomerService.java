package Services;

import com.online.restaurant.Customer;
import dao.CustomerDAO;
import util.AddressGenerator;
import util.EmaiIdGenrator;
import util.NameGenerator;
import util.phoneNumberGenerator;

public class CustomerService {

    private CustomerDAO customerDAO;

    public CustomerService(){
        customerDAO = new CustomerDAO();
    }
    public void createDummyCustomer(){
        for (int i = 0; i < 100; i++){
            Customer customer = new Customer();
            customer.setCustomerId(i+1);
            customer.setName(NameGenerator.getNames());
            customer.setAdress(AddressGenerator.getAddress());
            customer.setEmailId(EmaiIdGenrator.getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setState("Maharashtra");
            customer.setPhoneNumber(phoneNumberGenerator.getPhoneNumber());

            //TODO: Insert Customer into Database

            customerDAO.insertCustomer(customer);


            System.out.println("===COUSTOMER DETAILS===");
        System.out.println("Name : " + customer.getName());
        System.out.println("Address : " + customer.getAdress());
        System.out.println("City : " + customer.getCity());
        System.out.println("State : " + customer.getState());
        System.out.println("Email Id : " + customer.getEmailId());
        System.out.println("Phone no. : " + customer.getPhoneNumber());


        }
    }
}
