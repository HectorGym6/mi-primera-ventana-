package org.iesfm.mi_primera_ventana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class MyFlowLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 550, 300
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout()); // NO HACE FALTA PQ EL LAYOUT POR DEFECTO ES FLOWLAYOUT

        mainPanel.add(new JButton("Button 1"));
        mainPanel.add(new JButton("Button 2"));
        mainPanel.add(new JButton("Button 3"));
        mainPanel.add(new JButton("Long-Named Button 4"));
        mainPanel.add(new JButton("5"));

        ButtonGroup orientationBg = new ButtonGroup();
        JRadioButton leftToRight = new JRadioButton("Left to right");
        leftToRight.setSelected(true);
        orientationBg.add(leftToRight);
        mainPanel.add(leftToRight);

        JRadioButton rightToLef = new JRadioButton("Right to left");
        orientationBg.add(rightToLef);
        mainPanel.add(rightToLef);

        JButton applyOrientationButton = new JButton("Apply orientation");
        mainPanel.add(applyOrientationButton);

        applyOrientationButton.addActionListener(
                e -> {
                    FlowLayout flowLayout = (FlowLayout) mainPanel.getLayout();
                    if (leftToRight.isSelected()) {
                        // Hago que los componentes aparezcan alineados a la izquierda
                        flowLayout.setAlignment(FlowLayout.LEFT);
                    } else {
                        // Hago que los componentes aparezcan alineados a la derecha
                        flowLayout.setAlignment(FlowLayout.RIGHT);
                    }

                    // Ahora fuerzo a SWING a volver a pintar el mainPanel
                    mainPanel.repaint();
                    mainPanel.revalidate();
                }
        );

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}