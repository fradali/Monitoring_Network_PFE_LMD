package securst;
import java.sql.*;

public class Connectdb {
    Connection conn = null ;
    public static Connection Connectdab(){
        
      try{
         Class.forName("com.mysql.jdbc.Driver") ;
        Connection conn;
         Statement St;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom","root","");
             St = conn.createStatement();
         System.out.print("connexion etablie");
        }catch(ClassNotFoundException e){
          System.out.print("erreur driver");
         
         }catch(SQLException e){
          System.out.print("erreur Database");  
         
         }  
        return null;
        
    }
}
