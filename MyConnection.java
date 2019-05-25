/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Array.*;
import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class MyConnection {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        if(mysqlkonek==null){
            try {
                String DB="jdbc:mysql://localhost:3306/kantin_bkl"; // delta_db database
                String user="root"; // user database
                String passwor=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB,user,passwor);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }
}
    
 
     /*public static Connection getConnection(){ 
        Connection con= null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kantin_bkl","root","");
            // JOptionPane.showMessageDialog(null,"berhasil");
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"GAGAL","Informasi",JOptionPane.INFORMATION_MESSAGE);
         }
         return con;
         }
}*/
       /*try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
    }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost1527/kantin_bkl","root","");
            if(con != null){
                System.out.print("Berhasil Koneksi");
            }
        }catch(SQLException ex){
            System.out.printf("Koneksi gagal");
        }
    return con;
    }
}*/