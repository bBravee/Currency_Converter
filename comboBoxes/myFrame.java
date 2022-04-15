package myGUI.comboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JComboBox combobox;

    myFrame() {
        String[] names = {"USD", "EURO", "POUND"};

        combobox = new JComboBox(names);
        combobox.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.add(combobox);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combobox){
            System.out.println(combobox.getSelectedItem());
        }
    }
}
