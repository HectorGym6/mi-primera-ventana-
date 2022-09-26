package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 2000, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JLabel selectedLanguageLabel = new JLabel("Programming language Selected: ");
        mainPanel.add(selectedLanguageLabel);

        JComboBox<String> languageCb = new JComboBox<>();
        languageCb.addItemListener(
                e -> {
                    String selectedLanguage = e.getItem().toString();
                    selectedLanguageLabel.setText("Programming language Selected: " + selectedLanguage);
                }
        );
        languageCb.addItem("C");
        languageCb.addItem("C++");
        languageCb.addItem("C#");
        languageCb.addItem("Java");
        languageCb.addItem("PHP");
        mainPanel.add(languageCb);
        // CREAR Y AÑADIR LOS COMPONENTES

        JButton showButton = new JButton("Show");


        mainPanel.add(showButton);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();

    }
}