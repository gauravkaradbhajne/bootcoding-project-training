package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOService {
    public Connection getconnection(){
        try{
            //1. LOAD JDBC DRIVER
            Class.forName("org.postgresql.Driver");

            //2. established connection with database

            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres","9767635565");

            return con;



        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
