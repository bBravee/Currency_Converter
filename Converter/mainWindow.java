package myGUI.Converter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends JFrame implements ActionListener {

    JButton button1;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;

    JLabel label = new JLabel("Enter Amount");
    JLabel label2 = new JLabel("Select currency");
    JLabel label3 = new JLabel("After conversion");

    JComboBox comboBox;


    mainWindow() {
        Border border = BorderFactory.createLineBorder(new Color(0xbfe6ff), 3);

        label.setBounds(50, 100, 100, 25);
        label2.setBounds(50, 150, 150, 25);
        label3.setBounds(50, 320, 150, 25);

        Font font = new Font("Arial", Font. BOLD,14);

        label.setFont(font);
        label2.setFont(font);
        label3.setFont(font);


        String[] names = {"USD", "EURO", "PESO", "POUND"};
        comboBox = new JComboBox(names);
        comboBox.addActionListener(this);
        comboBox.setBounds(220, 150, 150, 30);

        //label.setBorder(border);

        ImageIcon icon = new ImageIcon("D:\\JavaClass\\myGUI\\Converter\\dollar.png");

        this.setTitle("Currency Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x8cd3ff));

        button1 = new JButton("Convert");
        button1.setBounds(225, 225, 100, 40);
        button1.addActionListener(this);

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        textField1.setBounds(220, 100, 150, 30);
        textField3.setBounds(220, 320, 150, 30);
        textField3.setFocusable(false); //Nie pozwala na wpisywanie czegokolwiek w to pole

        textField1.setBorder(border);
        comboBox.setBorder(border);
        textField3.setBorder(border);

        this.add(label);
        this.add(label2);
        this.add(label3);
        this.add(button1);
        this.add(textField1);
        this.add(comboBox);
        this.add(textField3);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double amount = Double.parseDouble(textField1.getText());
        double result;
        double convVal;

        if (comboBox.getSelectedItem().toString() == "USD") {
            if (e.getSource() == button1) {
                result = amount * 4.13;
                textField3.setText(String.valueOf(result));
            }
        } else if (comboBox.getSelectedItem().toString() == "EURO") {
            if (e.getSource() == button1) {
                result = amount * 5.2;
                textField3.setText(String.valueOf(result));
            }
        } else if (comboBox.getSelectedItem().toString() == "PESO") {
            if (e.getSource() == button1) {
                result = amount * 2.4;
                textField3.setText(String.valueOf(result));
            }
        } else {
            if (e.getSource() == button1) {
                result = amount * 5.4;
                textField3.setText(String.valueOf(result));
            }
        }
    }
}

// mozna dopisac hashmape