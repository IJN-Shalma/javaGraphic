package com.infCapraraZhou;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Gui {


    public static void showPanel(){
        JFrame f = new JFrame("Torino Respira");
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();

        TitledBorder title = BorderFactory.createTitledBorder("Lettura File di Dati");
        EmptyBorder emptyBorder = new EmptyBorder(15, 15, 15, 15);;
        CompoundBorder inner = new CompoundBorder(emptyBorder, title);
        p.setBorder(inner);

        gb.fill = GridBagConstraints.HORIZONTAL;
        gb.insets = new Insets(3,3,3,3);

        gb.gridwidth = 4;
        gb.gridx = 0;
        gb.gridy = 0;
        JButton selectFile = new JButton("Seleziona un File");
        p.add(selectFile, gb);


        gb.gridwidth = 4;
        gb.gridx = 0;
        gb.gridy = 1;
        JButton printData = new JButton("Stampa Dati");
        p.add(printData, gb);


        gb.gridwidth = 4;
        gb.weightx = 0.5;
        gb.gridx = 0;
        gb.gridy = 2;
        JButton drawGraphic = new JButton("Disegna Grafico Dati");
        p.add(drawGraphic, gb);

        gb.gridwidth = 4;
        gb.gridx = 0;
        gb.gridy = 3;
        JTextArea area = new JTextArea(20,50);
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        p.add(scroll, gb);

        gb.gridwidth = 4;
        gb.gridx = 0;
        gb.gridy = 4;
        JLabel credits = new JLabel("Caprara & Zhou 4^C Informatica");
        p.add(credits,gb);


        f.getContentPane().add(p);
        f.setLocation(100, 100);
        f.pack();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);


        Listeners listener = new Listeners(area);
        selectFile.addActionListener(listener);
        printData.addActionListener(listener);
        drawGraphic.addActionListener(listener);
    }
}
