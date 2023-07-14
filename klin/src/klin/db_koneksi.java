package klin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class db_koneksi {
    Connection con;
    Statement st;

public void config() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/klin","root","");
        st = (Statement) con.createStatement();
    }catch(ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Koneksi Gagal masuk ke Database!!!\n" + e.getMessage());
    }
  }
}
