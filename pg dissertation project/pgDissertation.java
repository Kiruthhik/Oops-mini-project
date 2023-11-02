import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import student_registration.StudentRegistration;
import guide_registration.GuideRegistration;
import login_page.loginPage;

//home page
public class pgDissertation {
    JFrame f;

    pgDissertation() {
        f = new JFrame("PG Dessertion");
        // final JTextField tf = new JTextField();
        JLabel l1 = new JLabel("PG Students");
        l1.setBounds(100, 50, 100, 20);
        // tf.setBounds(50, 50, 250, 20);
        JButton log = new JButton("Login");
        ImageIcon bg = new ImageIcon("C:\\Users\\HP\\.vscode\\PG dessertion\\home page bg3.jpg");
        JLabel bgLabel = new JLabel(bg);
        bgLabel.setBounds(0, 0, 1400, 800);
        bgLabel.setLayout(null);
        JButton b1 = new JButton("Register here");
        b1.setBounds(100, 80, 150, 20);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StudentRegistration();
            }
        });
        JLabel l2 = new JLabel("PG guides", null, 0);
        JButton b2 = new JButton("Register here", null);
        l2.setBounds(80, 200, 100, 20);
        b2.setBounds(100, 220, 150, 20);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GuideRegistration();
            }
        });
        log.setBounds(100, 400, 80, 20);
        log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new loginPage();
            }
        });
        f.setContentPane(bgLabel);
        f.setSize(1400, 800);
        f.add(b1);
        f.add(l1);
        f.add(l2);
        f.add(b2);
        f.add(log);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) {
        new pgDissertation();
    }

}
