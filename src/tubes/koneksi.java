/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class koneksi {
    private Connection koneksi;
    public Connection getKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
    }
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kantin_bkl","root","");
            if(koneksi != null){
                System.out.print("Berhasil Koneksi");
            }
        }catch(SQLException ex){
            System.out.printf("Koneksi gagal");
        }
    return koneksi;
    }
}