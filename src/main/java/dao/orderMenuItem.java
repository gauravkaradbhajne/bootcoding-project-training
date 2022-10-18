package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class orderMenuItem {
    public static final String TABLE_NAME = "app_order_menu_item";

    public void createTable() {
        try {
            //LOAD JDBC DRIVER
            Class.forName("org.postgresql.Driver");

            //established connection with database

            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "9767635565");

            //3. CREATE STATEMENT OBJECT

            Statement stmt = con.createStatement();
            //4.EXECUTE QUERY

            String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "(id bigint NOT NULL,"
                    + "order_id bigint,"
                    + "quantity int, "
                    + "menu_item_name text,"
                    + "total_price decimal,"
                    + "is_veg bool,"
                    + "CONSTRAINT app_order_menu_item_pk PRIMARY KEY(id))";
            System.out.println(" Create table query" + query);
            stmt.executeUpdate(query);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }



}
