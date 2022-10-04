package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setTitle("Ejemplo  GridBagLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new java.awt.GridBagLayout());
        f.setContentPane(mainPanel);

        mainPanel.add(
                new JLabel("Full name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        1,
                        0,
                        3,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("Street"),
                new GridBagConstraints(
                        1,
                        1,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("City"),
                new GridBagConstraints(
                        2,
                        1,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("Zip code"),
                new GridBagConstraints(
                        3,
                        1,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        1,
                        2,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        2,
                        2,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        3,
                        2,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("Phone"),
                new GridBagConstraints(
                        0,
                        3,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        1,
                        3,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("Age"),
                new GridBagConstraints(
                        2,
                        3,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JTextField(),
                new GridBagConstraints(
                        3,
                        3,
                        1,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JLabel("Description"),
                new GridBagConstraints(
                        0,
                        4,
                        1,
                        1,
                        1,
                        4,
                        GridBagConstraints.NORTHEAST,
                        GridBagConstraints.NONE,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );
        mainPanel.add(
                new JTextArea(),
                new GridBagConstraints(
                        1,
                        4,
                        3,
                        1,
                        1,
                        4,
                        GridBagConstraints.EAST,
                        GridBagConstraints.BOTH,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        mainPanel.add(
                new JButton("Submit"),
                new GridBagConstraints(
                        2,
                        5,
                        2,
                        1,
                        1,
                        0,
                        GridBagConstraints.EAST,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(5, 5, 5, 5),
                        0,
                        0
                )
        );

        f.revalidate();
        f.repaint();
    }
}