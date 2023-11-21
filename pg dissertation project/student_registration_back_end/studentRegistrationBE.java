package student_registration_back_end;

//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class studentRegistrationBE {
    public static String Gender = "";

    public studentRegistrationBE(JFrame f, JTextField tname, JTextField tdob, JTextField tphno, JTextField tnationality,
            JTextField tusername, JPasswordField tpassword) {
        String name = tname.getText();
        String dob = tdob.getText();
        String phno = tphno.getText();
        String nationality = tnationality.getText();
        String username = tusername.getText();
        char[] passwordch = tpassword.getPassword();
        String password = new String(passwordch);
        String url = "jdbc:mysql://localhost:3306/pgDissertation";

        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s", name, dob, phno, nationality, username, password, Gender);
        /*
         * try {
         * // Class.forName("com.mysql.pgDissertation.jdbc.Driver");
         * Class.forName("com.mysql.cj.jdbc.Driver");
         * Connection con = DriverManager.getConnection(url, "root", "Changeme@123");
         * Statement stmt = con.createStatement();
         * stmt.executeQuery(
         * "insert into student values(name,gender,dob,contact_number,nationality,user_name,password)"
         * );
         * } catch (Exception e) {
         * System.out.println(e);
         * }
         */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Changeme@123");
            // Statement stmt = con.createStatement();
            String sql = "INSERT INTO student (name, gender, dob, contact_number, nationality, user_name, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, Gender);
            preparedStatement.setString(3, dob);
            preparedStatement.setString(4, phno);
            preparedStatement.setString(5, nationality);
            preparedStatement.setString(6, username);
            preparedStatement.setString(7, password);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}