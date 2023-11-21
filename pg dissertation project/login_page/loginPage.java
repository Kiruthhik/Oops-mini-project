package login_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import login_page_back_end;
import login_page_back_end.loginPageBE;

public class loginPage {
    public loginPage() {
        JFrame j = new JFrame("Login page");
        JPanel panel = new JPanel();
        j.add(panel);
        JLabel username = new JLabel("User name:");
        JTextField tusername = new JTextField();
        JLabel password = new JLabel("Password:");
        JPasswordField tpassword = new JPasswordField();
        JCheckBox stud = new JCheckBox("Student");
        JCheckBox guid = new JCheckBox("Guide");
        JButton login = new JButton("Login");
        username.setBounds(300, 200, 150, 20);
        tusername.setBounds(450, 200, 200, 20);
        password.setBounds(300, 250, 150, 20);
        tpassword.setBounds(450, 250, 200, 20);
        stud.setBounds(300, 300, 80, 20);
        stud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginPageBE.roll = "student";
            }

        });
        guid.setBounds(400, 300, 80, 20);
        guid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginPageBE.roll = "guide";
            }
        });
        login.setBounds(500, 350, 80, 20);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginPageBE(j, tusername, tpassword);
            }
        });
        panel.setLayout(null);
        /*
         * j.add(username);
         * j.add(tusername);
         * j.add(password);
         * j.add(tpassword);
         * j.add(stud);
         * j.add(guid);
         */
        panel.add(username);
        panel.add(tusername);
        panel.add(password);
        panel.add(tpassword);
        panel.add(stud);
        panel.add(guid);
        panel.add(login);
        j.setSize(1400, 700);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*
     * public static void main(String args[]) {
     * new loginPage();
     * }
     */
}