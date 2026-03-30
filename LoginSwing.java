import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");
        JButton resetBtn = new JButton("Reset");

       
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);
        frame.add(resetBtn);

       
        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.equals("mani") && pass.equals("mani1234")) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Login");
            }
        });

        
        resetBtn.addActionListener(e -> {
            userField.setText("");
            passField.setText("");
        });

        frame.setVisible(true);
    }
}