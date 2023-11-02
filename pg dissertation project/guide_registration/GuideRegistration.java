package guide_registration;

import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class GuideRegistration {
    public GuideRegistration() {
        JFrame f = new JFrame("Guide Registration");
        JLabel name = new JLabel("Name:");
        JTextField tname = new JTextField();
        JLabel gender = new JLabel("Gender");
        JCheckBox male = new JCheckBox("Male");
        JCheckBox female = new JCheckBox("Female");
        JLabel dob = new JLabel("Date of Birth:");
        JTextField tdob = new JTextField();
        JLabel phno = new JLabel("Contact Number:");
        JTextField tphno = new JTextField();
        JLabel nationality = new JLabel("Nationality:");
        JTextField tnationality = new JTextField();
        JLabel userName = new JLabel("User Name:");
        JTextField tusername = new JTextField();
        JLabel password = new JLabel("Create Password:");
        JPasswordField tpassword = new JPasswordField();
        JLabel nulli = new JLabel();
        name.setBounds(300, 150, 100, 20);
        f.add(name);
        tname.setBounds(450, 150, 200, 20);
        f.add(tname);
        gender.setBounds(300, 200, 100, 20);
        f.add(gender);
        male.setBounds(450, 200, 100, 20);
        female.setBounds(550, 200, 100, 20);
        f.add(male);
        f.add(female);
        dob.setBounds(300, 250, 100, 20);
        f.add(dob);
        tdob.setBounds(450, 250, 200, 20);
        f.add(tdob);
        phno.setBounds(300, 300, 100, 20);
        f.add(phno);
        tphno.setBounds(450, 300, 200, 20);
        f.add(tphno);
        nationality.setBounds(300, 350, 100, 20);
        f.add(nationality);
        tnationality.setBounds(450, 350, 200, 20);
        f.add(tnationality);
        userName.setBounds(300, 400, 100, 20);
        f.add(userName);
        tusername.setBounds(450, 400, 200, 20);
        f.add(tusername);
        password.setBounds(300, 450, 200, 20);
        f.add(password);
        tpassword.setBounds(450, 450, 200, 20);
        f.add(tpassword);
        f.add(nulli);
        f.setSize(1400, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /*
     * public static void main(String args[]) {
     * new GuideRegistration();
     * }
     */

}
