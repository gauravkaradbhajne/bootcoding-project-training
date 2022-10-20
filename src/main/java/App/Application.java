package App;

import Services.CustomerService;
import dao.*;


public class Application {
    public static void main(String[] args) {

        //        Customer Gaurav = new Customer();
//
//        Gaurav.setName("Gaurav");
//        Gaurav.setAdress("Nandanvan , Nagpur");
//        Gaurav.setCity("Nagpur");
//        Gaurav.setState("Maharashtra");
//        Gaurav.setEmailId("gauravkaradbhajne@gmail.com");
//        Gaurav.setPhoneNumber(9767635565L);
//
//        System.out.println("===COUSTOMER DETAILS===");
//        System.out.println("Name : " + Gaurav.getName());
//        System.out.println("Address : " + Gaurav.getAdress());
//        System.out.println("City : " + Gaurav.getCity());
//        System.out.println("State : " + Gaurav.getState());
//        System.out.println("Email Id : " + Gaurav.getEmailId());
//        System.out.println("Phone no. : " + Gaurav.getPhoneNumber());
//
//
//
//        Vendor Haldiram = new Vendor();
//
//        Haldiram.setName("Haldiram Veg Reastraunt");
//        Haldiram.setAddress("Ajni square , Nagpur");
//        Haldiram.setCategory("veg");
//        Haldiram.setRating(5.0);
//        Haldiram.setCity("Nagpur");
//        Haldiram.setState("Maharashtra");
//        Haldiram.setPhoneNumber(9657925161l);
//
//        System.out.println("===VENDOR DETAILS===");
//        System.out.println("Reastraunt Name : " + Haldiram.getName());
//        System.out.println("Restraunt Address : " + Haldiram.getAddress());
//        System.out.println("Food Categoary : " + Haldiram.getCategory());
//        System.out.println("Rating : " + Haldiram.getRating());
//        System.out.println("City : " + Haldiram.getCity());
//        System.out.println("State : " + Haldiram.getState());
//        System.out.println("PhoneNumber : " + Haldiram.getPhoneNumber());
//
//        Order order = new Order();
//
//        order.setDelivery_add("101,civil lines,Nagpur");
//        order.setCustomer(Gaurav);
//        order.setOrderDate(new Date());
//        order.setOrderId(6565645);
//        order.setVendor(Haldiram);
//        order.setTotalAmount((100.0));
//
//
//        System.out.println("===ORDER DETAILS===");
//        System.out.println("Total Amount : " + order.getTotalAmount());
//        System.out.println("OrderDate : " + order.getOrderDate());
//        System.out.println("Delivery Adress : " + order.getDelivery_add());

        System.out.println("======CUSTOMER DETAILS========");
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();

        System.out.println("=======ORDER DETAILS========");
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.createTable();

        System.out.println("=======VENDOR DETAILS========");
        VendorDao vendorDao = new VendorDao();
        vendorDao.createTable();

        System.out.println("=======MENUITEM DETAILS========");
        MenuItemDAO menuItemDAO = new MenuItemDAO();
        menuItemDAO.createTable();


        System.out.println("=======ORDER MENUITEM DETAILS========");
        orderMenuItemDAO ordermenu = new orderMenuItemDAO();
        ordermenu.createTable();


        CustomerService cs = new CustomerService();
        cs.createDummyCustomer();


    }
}
