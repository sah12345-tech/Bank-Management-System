package asimulatorsystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conn {
Connection c;
Statement s;
public conn(){
try{
Class.forName("com.mysql.jdbc.Driver");
c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","");
s =c.createStatement();
}catch(Exception e){
System.out.println(e);
e.printStackTrace();
}
}
}