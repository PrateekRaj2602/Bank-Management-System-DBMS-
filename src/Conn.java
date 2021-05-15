import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
//            Class.forName("com.mysql.jdbc.Driver");  
//            c =DriverManager.getConnection("jdbc:mysql:///bms","root","root");    
//            s =c.createStatement(); 
//           
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bank","bank"); 
        	 s =c.createStatement(); 
        	 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  