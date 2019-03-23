package Swing.Login;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by a-19-k on 3/21/19.
 */
public class RegisterForm {
    public boolean checkUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `users` WHERE `username` =?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }


}




    // on the register button click
    /*private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {
        String fname = new JTextField().getText();
        String lname = new JTextField().getText();
        String uname = new JTextField().getText();
        String pass;
        pass = String.valueOf(JPasswordField.getPassword());

        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());
        String bdate = null;
        String address = jTextArea_ADDRESS.getText();

        if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }

        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }

        else if(checkUsername(uname))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }

        else{

            if(DateChooser_BDATE.getDate() != null)
            {
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                bdate = dateformat.format(jDateChooser_BDATE.getDate());
            }

            PreparedStatement ps;
            String query = "INSERT INTO `the_app_users`(`u_fname`, `u_lname`, `u_uname`, `u_pass`, `u_bdate`, `u_address`) VALUES (?,?,?,?,?,?)";

            try {
                ps = MyConnection.getConnection().prepareStatement(query);

                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, uname);
                ps.setString(4, pass);

                if(bdate != null)
                {
                    ps.setString(5, bdate);
                }else{
                    ps.setNull(5, 0);
                }
                ps.setString(6, address);

                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "New User Add");
                }

            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/


