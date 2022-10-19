package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
        public static final String TABLE_NAME = "app_customer";

        private DAOService daoService;
        public CustomerDAO(){

            //constructor
            daoService =new DAOService();
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


            }catch (Exception ex){
              ex.printStackTrace();
            }

        }

}
