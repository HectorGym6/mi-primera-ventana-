package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 2000, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel searchPanel = new JPanel();
        searchPanel.setBorder(
                BorderFactory.
                        createTitledBorder(
                                BorderFactory.createLineBorder(Color.gray, 1, true),
                                "Search"
                        )
        );

        ButtonGroup searchButtonGroup = new ButtonGroup();
        JRadioButton byNameRb = new JRadioButton("By name");
        searchButtonGroup.add(byNameRb);
        JRadioButton byIdRB = new JRadioButton("By Id");
        searchButtonGroup.add(byIdRB);

        searchPanel.add(byNameRb);
        searchPanel.add(byIdRB);

        mainPanel.add(searchPanel);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();

    }
}
