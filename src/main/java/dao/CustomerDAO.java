package dao;
import com.online.restaurant.Customer;

import java.sql.*;

public class CustomerDAO {
        public static final String TABLE_NAME = "app_customer";

        private DAOService daoService;
        public CustomerDAO(){

            //constructor
            daoService =new DAOService();
        }
        public void insertCustomer(Customer customer){
            try{
                Connection con = daoService.getconnection();
                String sql = "INSERT INTO " + TABLE_NAME
                        + " VALUES(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setLong(1,customer.getCustomerId());
                ps.setString(2,customer.getName());
                ps.setString(3,customer.getAdress());
                ps.setLong(4,customer.getPhoneNumber());
                ps.setString(5,customer.getCity());
                ps.setString(6,customer.getState());
                ps.setString(7,customer.getEmailId());

                ps.executeUpdate();
                con.close();

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        public void createTable(){
            try{
                Connection con = daoService.getconnection();

                //3. CREATE STATEMENT OBJECT

                Statement stmt = con.createStatement();
                //4.EXECUTE QUERY

                String sql = "Select * from " + TABLE_NAME;
                String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                        + "(id bigint NOT NULL,"
                        + "name text,"
                        + "address text,"
                        + "phone_number bigint,"
                        + "city text,"
                        + "state text,"
                        + "email_id text,"
                                +"CONSTRAINT app_customer_pk PRIMARY KEY(id))";
                System.out.println(" Create table query" + query);
                stmt.executeUpdate(query);

con.close();
            }catch (Exception ex){
              ex.printStackTrace();
            }

        }

}
