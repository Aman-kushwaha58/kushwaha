package com.company;

import javax.swing.*;
import java.awt.*;

public class registration {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Registration Form Example");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.YELLOW);

        // Set layout
        frame.setLayout(null);

        // Title Label
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(200, 20, 300, 30);
        frame.add(titleLabel);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(50, 80, 100, 30);
        frame.add(nameLabel);
        
        JTextField nameText = new JTextField();
        nameText.setBounds(200, 80, 200, 30);
        frame.add(nameText);

        // Father's Name Label and Text Field
        JLabel fatherNameLabel = new JLabel("Father's Name :");
        fatherNameLabel.setBounds(50, 120, 100, 30);
        frame.add(fatherNameLabel);
        
        JTextField fatherNameText = new JTextField();
        fatherNameText.setBounds(200, 120, 200, 30);
        frame.add(fatherNameText);

        // Gender Label and Radio Buttons
        JLabel genderLabel = new JLabel("Gender :");
        genderLabel.setBounds(50, 160, 100, 30);
        frame.add(genderLabel);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(200, 160, 70, 30);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(280, 160, 80, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        frame.add(male);
        frame.add(female);

        // Date of Birth Labels and ComboBoxes
        JLabel dobLabel = new JLabel("Date of Birth :");
        dobLabel.setBounds(50, 200, 100, 30);
        frame.add(dobLabel);
        
        String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(200, 200, 50, 30);
        frame.add(dayBox);

        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(260, 200, 60, 30);
        frame.add(monthBox);

        String[] years = { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970" };
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(330, 200, 70, 30);
        frame.add(yearBox);

        // Address Label and Text Area
        JLabel addressLabel = new JLabel("Address :");
        addressLabel.setBounds(50, 240, 100, 30);
        frame.add(addressLabel);
        
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(200, 240, 200, 60);
        frame.add(addressArea);

        // Phone Number Label and Text Field
        JLabel phoneLabel = new JLabel("Phone No. :");
        phoneLabel.setBounds(50, 310, 100, 30);
        frame.add(phoneLabel);
        
        JTextField phoneText = new JTextField();
        phoneText.setBounds(200, 310, 200, 30);
        frame.add(phoneText);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setBounds(50, 350, 100, 30);
        frame.add(emailLabel);
        
        JTextField emailText = new JTextField();
        emailText.setBounds(200, 350, 200, 30);
        frame.add(emailText);

        // Terms and Conditions Checkbox
        JCheckBox terms = new JCheckBox("I accept the terms and conditions");
        terms.setBounds(50, 390, 250, 30);
        frame.add(terms);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 440, 100, 30);
        frame.add(submitButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}
