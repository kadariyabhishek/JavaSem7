package Swing.Login;

import mf.JLabel1;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by a-19-k on 3/21/19.
 */
public class LoginForm extends MyConnection {

    public static void main(String[] args) {
        private void jButton_LOGINActionPerformed(java.awt.event.ActionEvent evt) {
            PreparedStatement ps;
            ResultSet rs;
            String uname = new JTextField().getText();
            String pass = String.valueOf(new JPasswordField().getPassword());

            String query = "SELECT * FROM `user` WHERE `username` =? AND `password` =?";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, uname);
                ps.setString(2, pass);

                rs = ps.executeQuery();

                if (rs.next()) {
                    JFrame mf = new JFrame();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    JLabel1.setText("Welcome < " + uname + " >");

                    mf.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }


}
