package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 450, 1000
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        // Creación de botones radio vinulados a un mismo ButtonGroup
        ButtonGroup osBg = new ButtonGroup();
        JRadioButton linuxRd = new JRadioButton("Linux", true);
        linuxRd.setActionCommand("Linux");
        JRadioButton windowsRd = new JRadioButton("Windows");
        windowsRd.setActionCommand("Windows");
        JRadioButton macRd = new JRadioButton("Macintosh");
        macRd.setActionCommand("Macintosh");
        JRadioButton androidRd = new JRadioButton("Android");
        androidRd.setActionCommand("Android");
        osBg.add(linuxRd);
        osBg.add(windowsRd);
        osBg.add(macRd);
        osBg.add(androidRd);
        mainPanel.add(linuxRd);
        mainPanel.add(windowsRd);
        mainPanel.add(macRd);
        mainPanel.add(androidRd);

        // Creación de JLabel con la imagen de Linux
        JLabel osIconLb = new JLabel();
        osIconLb.setIcon(new ImageIcon("Linux.png"));
        mainPanel.add(osIconLb);

        // Creación de botón ok
        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = osBg.getSelection().getActionCommand();

                JOptionPane.showMessageDialog(f, "Ha seleccionado " + selected);

                osIconLb.setIcon(new ImageIcon(selected + ".png"));
            }
        });
        mainPanel.add(okButton);

        // Añadimos el panel principal
        f.setContentPane(mainPanel);
        // Forzamos que se pinten todos los componentes
        f.repaint();
        f.revalidate();
    }
}