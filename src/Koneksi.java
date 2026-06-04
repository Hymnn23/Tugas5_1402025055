import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rivaldo
 */
public class Koneksi {
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/tugas5_1402025055";
            String user = "root";
            String password = "";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, user, password);
            
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
            return null;
        }
    }
}
