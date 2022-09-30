package org.iesfm.mi_primera_ventana;


import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10,10,300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel resultPanel = new JPanel();
        mainPanel.add(resultPanel,BorderLayout.NORTH);
        resultPanel.add(new JTextField(30));

        JPanel buttonsPanel = new JPanel(new GridLayout(5,4));
        mainPanel.add(buttonsPanel,BorderLayout.CENTER);

        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));
        buttonsPanel.add(new JButton("jiji"));





        f.setContentPane(mainPanel);









        f.repaint();
        f.revalidate();


    }

}