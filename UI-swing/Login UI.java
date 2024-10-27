import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystem extends JFrame {

    public LibraryManagementSystem() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create components
        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(20);
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");

        // Add components to a panel
        JPanel panel = new JPanel();
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);

        // Add the panel to the frame
        add(panel);

        // Add action listener to the login button
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login logic here (e.g., check credentials)
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                // ...
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LibraryManagementSystem();
    }
}