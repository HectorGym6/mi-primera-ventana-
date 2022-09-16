package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class Formulario {

        public static void main(String[] args) {

            JFrame f = new JFrame();
            f.setBounds(10,10,200,300);
            f.setVisible(true);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //IMPORTANTE PARA QUE NO NOS OCUPE MEMORIA, HACE QUE SE CIERREN LOS PROCESOS

            JPanel mainPanel = new JPanel();
            mainPanel.setBackground(Color.magenta); //con esto le metemos color
            f.setContentPane(mainPanel);
            //ESte es un componente de tipo etiqueta
            JLabel label = new JLabel("nombre");
            //Añadimos la etiqueta al panel
            mainPanel.add(label);

            //

            JTextField nameT = new JTextField(30);
            mainPanel.add(nameT);

            mainPanel.setBackground(Color.red);

            JButton aceptar = new JButton("Aceptar");
            mainPanel.add(aceptar);

            // esto es para que no falle no se el porque
            f.repaint();
            f.revalidate();

        }
    }

