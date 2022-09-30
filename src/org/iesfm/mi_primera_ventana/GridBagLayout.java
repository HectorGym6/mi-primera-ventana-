package org.iesfm.mi_primera_ventana;
import javax.swing.*;
import java.awt.*;
public class GridBagLayout {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setVisible(true);
        f.setTitle("Ejemplo 1 GridBagLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new java.awt.GridBagLayout());

        mainPanel.add(new JButton("1"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0));
        mainPanel.add(new JButton("2"),
                new GridBagConstraints(1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0));

        mainPanel.add(new JButton("4"),
                new GridBagConstraints(0,
                        1,
                        3,
                        1,
                        1.0,
                        3.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0));

        mainPanel.add(new JButton("3"),
                new GridBagConstraints(2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0));

        mainPanel.add(new JButton("5"),
                new GridBagConstraints(1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0));




        f.add(mainPanel);
        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();

    }
}