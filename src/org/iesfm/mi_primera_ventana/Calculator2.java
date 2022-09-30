package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2 {

        public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setBounds(
                    10, 10, 500, 300
            );
            f.setTitle("Calculadora");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

            JPanel resultPanel = new JPanel();
            mainPanel.add(resultPanel, BorderLayout.NORTH);
            resultPanel.add(new JTextField(40));

            JPanel buttonsPanel = new JPanel(new BorderLayout(5, 5));
            buttonsPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            buttonsPanel.setBackground(Color.GRAY);
            mainPanel.add(buttonsPanel, BorderLayout.CENTER);

            JPanel numberButtonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
            numberButtonsPanel.setOpaque(false);
            buttonsPanel.add(numberButtonsPanel, BorderLayout.CENTER);

            numberButtonsPanel.add(new JButton("7"));
            numberButtonsPanel.add(new JButton("8"));
            numberButtonsPanel.add(new JButton("9"));
            numberButtonsPanel.add(new JButton("DEL"));

            numberButtonsPanel.add(new JButton("4"));
            numberButtonsPanel.add(new JButton("5"));
            numberButtonsPanel.add(new JButton("6"));
            numberButtonsPanel.add(new JButton("*"));

            numberButtonsPanel.add(new JButton("1"));
            numberButtonsPanel.add(new JButton("2"));
            numberButtonsPanel.add(new JButton("3"));
            numberButtonsPanel.add(new JButton("-"));

            numberButtonsPanel.add(new JButton("."));
            numberButtonsPanel.add(new JButton("0"));
            numberButtonsPanel.add(new JButton("/"));
            numberButtonsPanel.add(new JButton("X"));

            JPanel equalsButtonsPanel = new JPanel(new GridLayout(1, 2, 5, 5));
            equalsButtonsPanel.setOpaque(false);
            equalsButtonsPanel.setPreferredSize(new Dimension(0, 50));
            buttonsPanel.add(equalsButtonsPanel, BorderLayout.SOUTH);
            equalsButtonsPanel.add(new JButton("RESET"));
            equalsButtonsPanel.add(new JButton("="));

            f.setContentPane(mainPanel);

            f.repaint();
            f.revalidate();
    }
}
