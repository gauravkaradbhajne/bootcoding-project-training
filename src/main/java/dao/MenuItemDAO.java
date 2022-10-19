package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME = "app_menu_item";

    private DAOService daoService;
    public MenuItemDAO(){

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
                    +"vendor_id bigint,"
                    + "menu_item_name text,"
                    + "price decimal,"
                    + "category text, "
                    + "is_veg bool,"
                    +"CONSTRAINT app_menu_item_pk PRIMARY KEY(id))";
            System.out.println(" Create table query" + query);
            stmt.executeUpdate(query);




        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}


