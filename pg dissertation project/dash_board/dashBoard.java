package dash_board;

import java.sql.*;
import javax.swing.*;

public class dashBoard {
    public dashBoard() {
        JFrame f = new JFrame("Dash Board");
        JPanel p = new JPanel();
        f.add(p);
        JLabel name = new JLabel("Name");
        name.setBounds(20, 50, 100, 20);
        p.add(name);
        JLabel gender = new JLabel("Gender");
        gender.setBounds(120, 50, 100, 20);
        p.add(gender);
        JLabel dob = new JLabel("DOB");
        dob.setBounds(220, 50, 100, 20);
        p.add(dob);
        JLabel phno = new JLabel("contact");
        phno.setBounds(320, 50, 100, 20);
        p.add(phno);
        JLabel nationality = new JLabel("Nationality");
        nationality.setBounds(420, 50, 100, 20);
        p.add(nationality);

        String url = "jdbc:mysql://localhost:3306/pgDissertation";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "Changeme@123");
            for (int i = 1; i <= 2; i++) {
                String sql = "select * from student where SNo = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                String index = Integer.toString(i);
                preparedStatement.setString(1, index);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String cname = resultSet.getString("name");
                        JLabel tname = new JLabel(cname);
                        tname.setBounds(20, 60 + (i * 10), 100, 20);
                        p.add(tname);
                        String cgender = resultSet.getString("gender");
                        JLabel tgender = new JLabel(cgender);
                        tgender.setBounds(120, 60 + (i * 10), 100, 20);
                        p.add(tgender);
                        String cdob = resultSet.getString("dob");
                        JLabel tdob = new JLabel(cdob);
                        tdob.setBounds(220, 60 + (i * 10), 100, 20);
                        p.add(tdob);
                        String cophno = resultSet.getString("contact_number");
                        JLabel tphno = new JLabel(cophno);
                        tphno.setBounds(320, 60 + (i * 10), 100, 20);
                        p.add(tphno);
                        String cnationality = resultSet.getString("nationality");
                        JLabel tnationality = new JLabel(cnationality);
                        tnationality.setBounds(420, 60 + (i * 10), 100, 20);
                        p.add(tnationality);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        p.setLayout(null);
        f.setSize(1400, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new dashBoard();
    }
}
