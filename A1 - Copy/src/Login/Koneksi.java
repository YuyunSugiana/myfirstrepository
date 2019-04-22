/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
    public static Connection Conn(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection konek = DriverManager.getConnection("jdbc:mysql://localhost/db_perusahaan","root",""); //nama database di localhost ataupun server untuk doublecot pertama
        return konek;                                                                                     //username root, dan password 0
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}
