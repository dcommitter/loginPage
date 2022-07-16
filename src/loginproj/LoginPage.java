package loginproj;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame{
    private JTextField userText1;
    private JPanel panel1;
    private JPasswordField password;
    private JButton loginButton;
    private JFrame frame;

    public LoginPage(){
        frame= new JFrame("Please Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(256,200));
        frame.setResizable(false);

        //now add the panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //final


    }
}
