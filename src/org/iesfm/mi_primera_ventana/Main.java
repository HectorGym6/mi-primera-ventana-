package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Creamos la ventana hasta abajo pero vacia
        JFrame f = new JFrame();
        f.setBounds(10,10,200,300);
f.setVisible(true);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //IMPORTANTE PARA QUE NO NOS OCUPE MEMORIA, HACE QUE SE CIERREN LOS PROCESOS
//HASTA AQUI ESTA VACIA

//Este es el panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.magenta); //con esto le metemos color
        //ESte es un componente de tipo etiqueta
        JLabel label = new JLabel("Hola Mundo");
        //Añadimos la etiqueta al panel
        mainPanel.add(label);
        //HAcemos que dentro del panel aparezca la etiqueta
        f.setContentPane(mainPanel);
}
}