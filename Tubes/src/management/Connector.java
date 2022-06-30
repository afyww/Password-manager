/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

/**
 *
 * @author Asus
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connector {
    
    private Connection koneksi;
    public Connection fikskoneksi(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("berhasil konek");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi"+ex);
        }
        
        String url = "jdbc:mysql://localhost/dekstop";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi database");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi database"+ex);
        }
        return koneksi;
    }
}

