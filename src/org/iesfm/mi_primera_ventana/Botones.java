package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        ButtonGroup osBg = new ButtonGroup();

        JRadioButton linuxRd = new JRadioButton("Linux");
        linuxRd.setActionCommand("linux");
        JRadioButton windowsRd = new JRadioButton("Windows");
        windowsRd.setActionCommand("Windows");
        JRadioButton iosRd = new JRadioButton("MacOS");
        iosRd.setActionCommand("MacOS");

        osBg.add(linuxRd);
        osBg.add(windowsRd);
        osBg.add(iosRd);

        mainPanel.add(linuxRd);
        mainPanel.add(windowsRd);
        mainPanel.add(iosRd);

        JLabel osIconLb = new JLabel();

        osIconLb.setIcon(new ImageIcon("linuxx.jpg"));
        mainPanel.add(osIconLb);

        JLabel win = new JLabel();
        win.setIcon(new ImageIcon("winx.jpg"));
        mainPanel.add(win);

        JLabel mac = new JLabel();
        mac.setIcon(new ImageIcon("macos.png"));
        mainPanel.add(mac);


        JButton botonOk = new JButton("ok");
        botonOk.addActionListener(new ActionListener() {
            @Override //este metodo dicta lo que va a pasar si hacemos click en el boton
            public void actionPerformed(ActionEvent e) {
                String selected = osBg.getSelection().getActionCommand();
                JOptionPane.showMessageDialog(f,"Ha seleccionado" + selected);

                osIconLb.setIcon(new ImageIcon(selected + ".jpg"));
            }
        });
        mainPanel.add(botonOk);

        f.setContentPane(mainPanel);
        f.revalidate();
        f.repaint();
    }
}

