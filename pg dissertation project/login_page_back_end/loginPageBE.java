package login_page_back_end;

import dash_board.dashBoard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.ResultSet;

public class loginPageBE {
    public static String roll = "";

    public loginPageBE(JFrame f, JTextField user_name, JPasswordField password) {
        String tuser_name = user_name.getText();
        char[] tpasswordch = password.getPassword();
        String tpassword = new String(tpasswordch);
        String url = "jdbc:mysql://localhost:3306/pgDissertation";

        // System.out.printf("%s\n%s\n%s", tuser_name, tpassword, roll);
        if (roll == "student") {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "Changeme@123");
                String sql = "select password from student where user_name = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                // preparedStatement.setString(1, roll);
                preparedStatement.setString(1, tuser_name);
                String Actpassword = "";
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        Actpassword = resultSet.getString("password");
                    } else {
                        JFrame frame = new JFrame("Error");
                        JTextField tField = new JTextField("User Not Found");
                        tField.setBounds(50, 50, 100, 20);
                        frame.add(tField);
                        frame.setSize(400, 200);
                        frame.setVisible(true);
                        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                if (tpassword.equalsIgnoreCase(Actpassword)) {
                    // System.out.printf("%s\n%s", Actpassword, tpassword);
                    new dashBoard();

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "Changeme@123");
                String sql = "select password from guide where user_name = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                // preparedStatement.setString(1, roll);
                preparedStatement.setString(1, tuser_name);
                String Actpassword = "";
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        Actpassword = resultSet.getString("password");
                    } else {
                        JFrame frame = new JFrame("Error");
                        JTextField tField = new JTextField("User Not Found");
                        tField.setBounds(50, 50, 100, 20);
                        frame.add(tField);
                        frame.setSize(400, 200);
                        frame.setVisible(true);
                        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }

                if (tpassword.equalsIgnoreCase(Actpassword)) {
                    // System.out.printf("%s\n%s", Actpassword, tpassword);
                    new dashBoard();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
