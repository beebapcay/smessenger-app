package client.views;

import java.awt.*;
import javax.swing.*;
import client.utils.*;



class LoginContentPanel extends JPanel {
    private Theme theme;
    private JLabel appNameLabel, welcomeLabel, introLabel, usernameLabel, passwordLabel, forgotLabel, orSignupLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginBtn, signupBtn;

    public LoginContentPanel(Dimension dimension) {

        //Set default layout
        this.setBackground(theme.darkColor);
        this.setPreferredSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);

        //Set appNameTitle
        appNameLabel = new JLabel("S-MESSENGER", SwingConstants.CENTER);
        appNameLabel.setSize(this.getWidth(), 35);
        appNameLabel.setForeground(theme.orangeColor);
        appNameLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        appNameLabel.setLocation(0,30);
        this.add(appNameLabel);

        //Set welcomeApp
        welcomeLabel = new JLabel("Welcome to S-Messenger", SwingConstants.CENTER);
        welcomeLabel.setSize(this.getWidth(), 20);
        welcomeLabel.setForeground(theme.whiteColor);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 18));
        welcomeLabel.setLocation(0, 95);
        this.add(welcomeLabel);

        //Set introApp
        introLabel = new JLabel("The simple way to chat directly from your computer", SwingConstants.CENTER);
        introLabel.setSize(this.getWidth(), 20);
        introLabel.setForeground(theme.transparentBlackColor);
        introLabel.setFont(new Font("Roboto", Font.BOLD, 14));
        introLabel.setLocation(0, 135);
        this.add(introLabel);

        //Set input username
        usernameLabel = new JLabel("Username", SwingConstants.LEFT);
        usernameLabel.setSize(this.getWidth() - 100, 20);
        usernameLabel.setForeground(theme.softCyanColor);
        usernameLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        usernameLabel.setLocation(50, 230);
        this.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setSize(this.getWidth() - 100, 40);
        usernameField.setFont(new Font("Roboto", Font.PLAIN, 16));
        usernameField.setBackground(theme.lightGrayColor);
        usernameField.setLocation(50, 255);
        usernameField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        usernameField.setBorder(BorderFactory.createCompoundBorder(usernameField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(usernameField);

        //Set input password
        passwordLabel = new JLabel("Password", SwingConstants.LEFT);
        passwordLabel.setSize(this.getWidth() - 100, 20);
        passwordLabel.setForeground(theme.softCyanColor);
        passwordLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        passwordLabel.setLocation(50, 305);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setSize(this.getWidth() - 100, 40);
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 16));
        passwordField.setBackground(theme.lightGrayColor);
        passwordField.setLocation(50, 330);
        passwordField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        passwordField.setBorder(BorderFactory.createCompoundBorder(passwordField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(passwordField);

        //Set forgotLabel
        forgotLabel = new JLabel("Forgot password ?", SwingConstants.RIGHT);
        forgotLabel.setSize(this.getWidth() - 100, 20);
        forgotLabel.setForeground(theme.cyanColor);
        forgotLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        forgotLabel.setLocation(50, 390);
        this.add(forgotLabel);

        //Set button login
        loginBtn = new JButton("Login");
        loginBtn.setSize(this.getWidth() - 100, 40);
        loginBtn.setForeground(theme.whiteColor);
        loginBtn.setFocusPainted(false);
        loginBtn.setFont(new Font("Roboto", Font.BOLD, 22));
        loginBtn.setBackground(theme.orangeColor);
        loginBtn.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        loginBtn.setLocation(50, 450);
        this.add(loginBtn);

        //Set or signupLabel
        orSignupLabel = new JLabel("Or Sign Up Using", SwingConstants.CENTER);
        orSignupLabel.setSize(this.getWidth() - 100, 20);
        orSignupLabel.setForeground(theme.whiteColor);
        orSignupLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        orSignupLabel.setLocation(50, 570);
        this.add(orSignupLabel);

        //Set button Signup
        signupBtn = new JButton("Signup");
        signupBtn.setSize(this.getWidth() - 100, 40);
        signupBtn.setForeground(theme.whiteColor);
        signupBtn.setFocusPainted(false);
        signupBtn.setFont(new Font("Roboto", Font.BOLD, 22));
        signupBtn.setBackground(theme.deepBlueColor);
        signupBtn.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        signupBtn.setLocation(50, 595);
        this.add(signupBtn);

    }
}

class LoginFrame extends JFrame {
    public LoginFrame() {
        this.setTitle("S-MESSENGER");
        ImageIcon icon = new ImageIcon("resources/images/logo/logo.png");
        this.setIconImage(icon.getImage());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(420,720);
        this.setResizable(false);

        this.setContentPane(new LoginContentPanel(new Dimension(this.getWidth(), this.getHeight())));

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class LoginGUI {
    public static void main(String[] args) {
        new LoginFrame();
    }
}

