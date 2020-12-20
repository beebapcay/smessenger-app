package client.views;

import java.awt.*;
import javax.swing.*;
import client.utils.*;

class SignupContentPanel extends JPanel {
    private Theme theme;
    private JLabel appNameLabel, signupLabel, firstnameLabel, lastnameLabel, ageLabel, genderLabel, usernameLabel, passwordLabel, orLoginLabel;
    private JTextField firstnameField, lastnameField, ageField, usernameField;
    private JRadioButton maleRadioBtn, femaleRadioBtn;
    private ButtonGroup genderGroup;
    private JPasswordField passwordField;
    private JButton loginBtn, signupBtn;

    public SignupContentPanel(Dimension dimension) {
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

        //Set intro Signup Title
        signupLabel = new JLabel("Signup to use S-Messenger", SwingConstants.CENTER);
        signupLabel.setSize(this.getWidth(), 25);
        signupLabel.setForeground(theme.whiteColor);
        signupLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        signupLabel.setLocation(0, 95);
        this.add(signupLabel);

        //Set input firstname
        firstnameLabel = new JLabel("Firstname", SwingConstants.LEFT);
        firstnameLabel.setSize(this.getWidth() - 100, 20);
        firstnameLabel.setForeground(theme.softCyanColor);
        firstnameLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        firstnameLabel.setLocation(50, 145);
        this.add(firstnameLabel);

        firstnameField = new JTextField();
        firstnameField.setSize(this.getWidth() - 100, 40);
        firstnameField.setFont(new Font("Roboto", Font.PLAIN, 16));
        firstnameField.setBackground(theme.lightGrayColor);
        firstnameField.setLocation(50, 170);
        firstnameField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        firstnameField.setBorder(BorderFactory.createCompoundBorder(firstnameField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(firstnameField);

        //Set input lastname
        lastnameLabel = new JLabel("Lastname", SwingConstants.LEFT);
        lastnameLabel.setSize(this.getWidth() - 100, 20);
        lastnameLabel.setForeground(theme.softCyanColor);
        lastnameLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        lastnameLabel.setLocation(50, 220);
        this.add(lastnameLabel);

        lastnameField = new JTextField();
        lastnameField.setSize(this.getWidth() - 100, 40);
        lastnameField.setFont(new Font("Roboto", Font.PLAIN, 16));
        lastnameField.setBackground(theme.lightGrayColor);
        lastnameField.setLocation(50, 245);
        lastnameField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        lastnameField.setBorder(BorderFactory.createCompoundBorder(lastnameField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(lastnameField);

        //Set input age
        ageLabel = new JLabel("Age", SwingConstants.LEFT);
        ageLabel.setSize((int)(this.getWidth() - 100) / 3, 20);
        ageLabel.setForeground(theme.softCyanColor);
        ageLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        ageLabel.setLocation(50, 295);
        this.add(ageLabel);

        ageField = new JTextField();
        ageField.setSize((int)(this.getWidth() - 100) / 3, 40);
        ageField.setFont(new Font("Roboto", Font.PLAIN, 16));
        ageField.setBackground(theme.lightGrayColor);
        ageField.setLocation(50, 320);
        ageField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        ageField.setBorder(BorderFactory.createCompoundBorder(ageField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(ageField);

        //Set input gender
        int genderGroupWidth = (this.getWidth() - 100) -  ageField.getWidth();
        ImageIcon checkedIcon = IconHandle.loadIcon("resources/images/icon/checked.png", new Dimension(15,15));
        ImageIcon uncheckedIcon = IconHandle.loadIcon("resources/images/icon/unchecked.png", new Dimension(15,15));

        genderLabel = new JLabel("Gender", SwingConstants.LEFT);
        genderLabel.setSize(genderGroupWidth - 20, 20);
        genderLabel.setForeground(theme.softCyanColor);
        genderLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        genderLabel.setLocation(50 + ageLabel.getWidth() + 20, 295);
        this.add(genderLabel);

        maleRadioBtn = new JRadioButton("Male");
        maleRadioBtn.setForeground(theme.whiteColor);
        maleRadioBtn.setSize(genderGroupWidth / 2,40);
        maleRadioBtn.setFont(new Font("Roboto", Font.BOLD, 15));
        maleRadioBtn.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        maleRadioBtn.setBackground(theme.darkColor);
        maleRadioBtn.setLocation(50 + ageField.getWidth() + 20, 320);
        maleRadioBtn.setIconTextGap(10);
        maleRadioBtn.setFocusPainted(false);
        maleRadioBtn.setIcon(uncheckedIcon);
        maleRadioBtn.setSelectedIcon(checkedIcon);
        this.add(maleRadioBtn);

        femaleRadioBtn = new JRadioButton("Female");
        femaleRadioBtn.setForeground(theme.whiteColor);
        femaleRadioBtn.setSize(genderGroupWidth / 2,40);
        femaleRadioBtn.setFont(new Font("Roboto", Font.BOLD, 15));
        femaleRadioBtn.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        femaleRadioBtn.setBackground(theme.darkColor);
        femaleRadioBtn.setLocation(50 + ageField.getWidth() + 20 + maleRadioBtn.getWidth(), 320);
        femaleRadioBtn.setIconTextGap(10);
        femaleRadioBtn.setFocusPainted(false);
        femaleRadioBtn.setIcon(uncheckedIcon);
        femaleRadioBtn.setSelectedIcon(checkedIcon);
        this.add(femaleRadioBtn);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioBtn);
        genderGroup.add(femaleRadioBtn);

        //Set input username
        usernameLabel = new JLabel("Username", SwingConstants.LEFT);
        usernameLabel.setSize(this.getWidth() - 100, 20);
        usernameLabel.setForeground(theme.softCyanColor);
        usernameLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        usernameLabel.setLocation(50, 370);
        this.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setSize(this.getWidth() - 100, 40);
        usernameField.setFont(new Font("Roboto", Font.PLAIN, 16));
        usernameField.setBackground(theme.lightGrayColor);
        usernameField.setLocation(50, 395);
        usernameField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        usernameField.setBorder(BorderFactory.createCompoundBorder(usernameField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(usernameField);

        //Set input password
        passwordLabel = new JLabel("Password", SwingConstants.LEFT);
        passwordLabel.setSize(this.getWidth() - 100, 20);
        passwordLabel.setForeground(theme.softCyanColor);
        passwordLabel.setFont(new Font("Roboto", Font.BOLD, 15));
        passwordLabel.setLocation(50, 445);
        this.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setSize(this.getWidth() - 100, 40);
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 16));
        passwordField.setBackground(theme.lightGrayColor);
        passwordField.setLocation(50, 470);
        passwordField.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        passwordField.setBorder(BorderFactory.createCompoundBorder(passwordField.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        this.add(passwordField);

        //Set button Signup
        signupBtn = new JButton("Signup");
        signupBtn.setSize(this.getWidth() - 100, 40);
        signupBtn.setForeground(theme.whiteColor);
        signupBtn.setFocusPainted(false);
        signupBtn.setFont(new Font("Roboto", Font.BOLD, 22));
        signupBtn.setBackground(theme.orangeColor);
        signupBtn.setBorder(BorderFactory.createLineBorder(theme.darkColor));
        signupBtn.setLocation(50, 535);
        this.add(signupBtn);

        //Set or loginLabel
        orLoginLabel = new JLabel("Or Login Using", SwingConstants.CENTER);
        orLoginLabel.setSize(this.getWidth() - 100, 20);
        orLoginLabel.setForeground(theme.whiteColor);
        orLoginLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        orLoginLabel.setLocation(50, 590);
        this.add(orLoginLabel);

        //Set button login
        loginBtn = new JButton("Login");
        loginBtn.setSize(this.getWidth() - 100, 40);
        loginBtn.setForeground(theme.whiteColor);
        loginBtn.setFocusPainted(false);
        loginBtn.setFont(new Font("Roboto", Font.BOLD, 22));
        loginBtn.setBackground(theme.deepBlueColor);
        loginBtn.setBorder(BorderFactory.createLineBorder(theme.deepBlueColor));
        loginBtn.setLocation(50, 625);
        this.add(loginBtn);

    }
}

class SignupFrame extends JFrame {
    public SignupFrame() {
        this.setTitle("S-MESSENGER");
        ImageIcon icon = new ImageIcon("resources/images/logo/logo.png");
        this.setIconImage(icon.getImage());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(420,720);
        this.setResizable(false);

        this.setContentPane(new SignupContentPanel(new Dimension(this.getWidth(), this.getHeight())));

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class SignupGUI {
    public static void main(String[] args) {
        new SignupFrame();
    }
}
