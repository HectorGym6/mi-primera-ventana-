package org.iesfm.mi_primera_ventana;

import javax.swing.*;

public class MyRadioButtonsWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 400, 1000
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        ButtonGroup osBg = new ButtonGroup();

        JRadioButton linuxRd = new JRadioButton("Linux");
        JRadioButton windowsRd = new JRadioButton("Windows");
        JRadioButton macRd = new JRadioButton("Macintosh");

        osBg.add(linuxRd);
        osBg.add(windowsRd);
        osBg.add(macRd);

        mainPanel.add(linuxRd);
        mainPanel.add(windowsRd);
        mainPanel.add(macRd);

        JLabel linuxLb = new JLabel();
        linuxLb.setIcon(new ImageIcon("linux.png"));

        mainPanel.add(linuxLb);

        JButton okButton = new JButton("Ok");
        mainPanel.add(okButton);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}