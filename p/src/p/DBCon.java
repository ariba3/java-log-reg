package p;

import java.sql.*;
public class DBCon {
    private Statement st;
    private Connection con;
    DBCon(){
    	try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Student","root","");   
            st = con.createStatement();
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void insert(String query){        
        System.out.println(query);        
        try {
            st.executeUpdate(query);
        }        
        catch (SQLException e) {           
            System.out.println(e);
        }
    }
    
}























