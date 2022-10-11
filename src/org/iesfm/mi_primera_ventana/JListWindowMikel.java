package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListWindowMikel{

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(
                10, 10, 500, 300
        );
        f.setTitle("GridBagWindow");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel labelPanel = new JPanel();
        JLabel jListLabel = new JLabel("JList", SwingConstants.CENTER);
        jListLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        jListLabel.setPreferredSize(new Dimension(200, 80));
        jListLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        labelPanel.add(jListLabel);

        mainPanel.add(labelPanel, BorderLayout.NORTH);

        DefaultListModel<String> peopleModel = new DefaultListModel<>();
        peopleModel.addElement("Christian David");
        peopleModel.addElement("Ana Milena");

        JPanel listPanel = new JPanel(new BorderLayout());
        JPanel addOptionPanel = new JPanel();
        JTextField addPersonTextField = new JTextField(20);
        addOptionPanel.add(addPersonTextField);

        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String person = addPersonTextField.getText();
                if (person.isBlank()) {
                    JOptionPane.showMessageDialog(f,
                            "Debe introducir un nombre de persona"
                    );
                } else {
                    peopleModel.addElement(person);
                    addPersonTextField.setText("");
                }

            }
        });

        addOptionPanel.add(addButton);

        listPanel.add(addOptionPanel, BorderLayout.NORTH);
        JList<String> peopleList = new JList<>();

        peopleList.setModel(peopleModel);

        listPanel.add(new JScrollPane(peopleList), BorderLayout.CENTER);

        mainPanel.add(listPanel, BorderLayout.CENTER);
        JPanel buttonsPanel = new JPanel();
        JButton deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = peopleList.getSelectedIndex();
                peopleModel.removeElementAt(selected);
            }
        });
        buttonsPanel.add(deleteButton);
        JButton clearButton = new JButton("Borrar lista");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peopleModel.clear();
            }
        });

        jListLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jListLabel.setForeground(Color.CYAN);


            }

            @Override
            public void mouseExited(MouseEvent e) {
                jListLabel.setForeground(Color.black);

            }
        });
        buttonsPanel.add(clearButton);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
