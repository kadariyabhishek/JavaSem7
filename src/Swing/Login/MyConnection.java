package Swing.Login;

import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by a-19-k on 3/21/19.
 */
public class MyConnection {

    // create a function to connect with mysql database

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/swing_app", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }


}

