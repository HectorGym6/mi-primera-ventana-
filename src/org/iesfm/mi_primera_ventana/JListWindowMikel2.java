package org.iesfm.mi_primera_ventana;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListWindowMikel2 extends JFrame {

    private JPanel labelPanel;
    private JLabel jListLabel;
    private DefaultListModel<String> peopleModel;
    private JPanel listPanel;
    private JPanel addOptionPanel;
    private JTextField addPersonTextField;
    private JButton addButton;
    private JList<String> peopleList;
    private JPanel buttonsPanel;
    private JButton deleteButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public JListWindowMikel2() throws HeadlessException {
        this.setBounds(
                10, 10, 500, 300
        );
        this.setTitle("GridBagWindow");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(createMainPanel());
        this.repaint();
        this.revalidate();
    }

    private JPanel createMainPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(createLabelPanel(), BorderLayout.NORTH);
        mainPanel.add(createListPanel(), BorderLayout.CENTER);
        mainPanel.add(createButtonsPanel(), BorderLayout.SOUTH);
        return mainPanel;
    }

    private JPanel createLabelPanel() {
        labelPanel = new JPanel();
        jListLabel = new JLabel("JList", SwingConstants.CENTER);
        jListLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        jListLabel.setPreferredSize(new Dimension(200, 80));
        jListLabel.setBorder(BorderFactory.createLoweredBevelBorder());
        labelPanel.add(jListLabel);
        return labelPanel;
    }

    private JPanel createListPanel() {
        listPanel = new JPanel(new BorderLayout());
        listPanel.add(createAddOptionPanel(), BorderLayout.NORTH);
        listPanel.add(new JScrollPane(createPeopleList()), BorderLayout.CENTER);
        return listPanel;
    }

    private JList createPeopleList() {
        peopleList = new JList<>();
        peopleModel = new DefaultListModel<>();
        peopleModel.addElement("Christian David");
        peopleModel.addElement("Ana Milena");
        peopleList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        peopleList.setModel(peopleModel);
        return peopleList;
    }

    private JPanel createAddOptionPanel() {
        addOptionPanel = new JPanel();
        addPersonTextField = new JTextField(20);
        addOptionPanel.add(addPersonTextField);

        addButton = new JButton("Agregar");
        addButton.addActionListener(e -> {
            String person = addPersonTextField.getText();
            if (person.isBlank()) {
                JOptionPane.showMessageDialog(this,
                        "Debe introducir un nombre de persona"
                );
            } else {
                peopleModel.addElement(person);
                addPersonTextField.setText("");
            }

        });

        addOptionPanel.add(addButton);
        return addOptionPanel;
    }

    private JPanel createButtonsPanel() {
        buttonsPanel = new JPanel();
        buttonsPanel.add(createDeleteButton());
        buttonsPanel.add(createClearButton());
        return buttonsPanel;
    }

    private JButton createDeleteButton() {
        deleteButton = new JButton("Eliminar");
        deleteButton.addActionListener(e -> {
            int selected = peopleList.getSelectedIndex();
            peopleModel.removeElementAt(selected);
        });
        return deleteButton;
    }

    private JButton createClearButton() {
        clearButton = new JButton("Borrar lista");
        clearButton.addActionListener(e -> peopleModel.clear());
        return clearButton;
    }

    public static void main(String[] args) {

        JFrame f = new JListWindowMikel2();

    }
}