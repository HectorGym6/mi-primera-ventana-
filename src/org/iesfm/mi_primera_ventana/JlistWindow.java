package org.iesfm.mi_primera_ventana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JlistWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame("FindReplace");
        f.setBounds(
                10, 10, 400, 400
        );
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Quita la opcion de grandar la pantalla
        f.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10,10));

        JPanel northPanel = new JPanel();

        JLabel textoNorte = new JLabel("JList", SwingConstants.CENTER);
        textoNorte.setBorder(BorderFactory.createLoweredBevelBorder());
        textoNorte.setPreferredSize(new Dimension(200,50));
        textoNorte.setFont(new Font("Calibri", Font.PLAIN , 20));

        northPanel.add(textoNorte, BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        JLabel textoSouth = new JLabel("Se agregó un nuevo elemento");

        southPanel.add(textoSouth, BorderLayout.CENTER);
        southPanel.setVisible(false);

        mainPanel.add(southPanel, BorderLayout.SOUTH);

        JPanel centePanel = new JPanel(new java.awt.GridBagLayout());

        JTextField areaTexto = new JTextField(20);
        centePanel.add(areaTexto,
                new GridBagConstraints(
                        0,
                        0,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 20, 0, 0),
                        0, 0));
        JButton agregar = new JButton("Agregar");
        centePanel.add(agregar,
                new GridBagConstraints(
                        2,
                        0,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 20),
                        0, 0));

        JList<String> people = new JList<>();
        DefaultListModel<String> peopleModel = new DefaultListModel<>();
        people.setModel(peopleModel);

        centePanel.add(new JScrollPane(people),
                new GridBagConstraints(
                        0,
                        1,
                        4,
                        1,
                        1,
                        1,
                        GridBagConstraints.CENTER,
                        GridBagConstraints.BOTH,
                        new Insets(0, 20, 0, 20),
                        0, 0));
        JButton eliminar = new JButton("Eliminar");
        centePanel.add(eliminar,
                new GridBagConstraints(
                        0,
                        2,
                        1,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 20, 0, 0),
                        0, 0));
        JButton eliLista = new JButton("Borrar lista");
        centePanel.add(eliLista,
                new GridBagConstraints(
                        2,
                        2,
                        2,
                        1,
                        1,
                        1,
                        GridBagConstraints.SOUTH,
                        GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 20),
                        0, 0));


        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                peopleModel.addElement(areaTexto.getText());
                southPanel.setVisible(true);

                if(areaTexto.getText().equals("")){
                    JOptionPane.showMessageDialog(f,"Debes introducir un texto");
                }
            }
        });

        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int selected = people.getSelectedIndex();
                peopleModel.removeElementAt(selected);
                textoSouth.setText("El elemento ha sido eliminado");
                southPanel.setVisible(true);
            }
        });

        eliLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                peopleModel.clear();
                JOptionPane.showMessageDialog(f, "Lista Borrada");
                southPanel.setVisible(false);

            }
        });

        mainPanel.add(centePanel, BorderLayout.CENTER);

        f.setContentPane(mainPanel);

        f.repaint();
        f.revalidate();
    }
}

    //OPCION ANGEL Y HECTOR PARA HACERLO
