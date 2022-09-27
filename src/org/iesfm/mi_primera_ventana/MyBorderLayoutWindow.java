package org.iesfm.mi_primera_ventana;


import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));

        JButton northButton = new JButton("Hide North Border");
        northButton.addActionListener(
                e ->
                        // Se saca el botón del ActionEvent e
                        ((JButton) e.getSource()).setVisible(false)
        );
        mainPanel.add(northButton, BorderLayout.NORTH);

        JButton centerButton = new JButton("Hide Center Border");
        centerButton.addActionListener(
                e -> centerButton.setVisible(false)
        );
        mainPanel.add(centerButton, BorderLayout.CENTER);

        JButton westButton = new JButton("Hide West Border");
        westButton.addActionListener(
                e -> westButton.setVisible(false)
        );
        mainPanel.add(westButton, BorderLayout.WEST);

        JButton eastButton = new JButton("Hide EAST Border");
        eastButton.addActionListener(
                e -> eastButton.setVisible(false)
        );
        mainPanel.add(eastButton, BorderLayout.EAST);

        JButton southButton = new JButton("Hide South Border");
        southButton.addActionListener(
                e ->
                        southButton.setVisible(false)
        );
        mainPanel.add(southButton, BorderLayout.SOUTH);


        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}