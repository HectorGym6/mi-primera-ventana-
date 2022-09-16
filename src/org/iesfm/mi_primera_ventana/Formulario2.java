package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class Formulario2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 100, 100);
        panel1.setBackground(Color.CYAN);

        JPanel panel2 = new JPanel();
        panel2.setBounds(200, 0, 100, 100);
        panel2.setBackground(Color.yellow);

        mainPanel.add(panel2);
        mainPanel.add(panel1);

        f.setContentPane(mainPanel);
        f.revalidate();
        f.repaint();
    }
    }
    //
