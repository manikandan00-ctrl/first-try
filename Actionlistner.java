import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, resetButton;

    public LoginApp() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

   
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

   
        usernameField = new JTextField();
        passwordField = new JPasswordField();

 
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");


        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

  
        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(resetButton);

        add(panel);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

      
            if ("admin".equals(username) && "1234".equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
     
        SwingUtilities.invokeLater(() -> new LoginApp());
    }
}
