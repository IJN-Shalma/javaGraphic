package com.infCapraraZhou;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import javafx.application.Platform;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Listeners implements ActionListener {

    private JTextArea area;
    private String inputPath = null;
    private ArrayList<Feature> featurelist;
    private String scope = null;

    public Listeners(JTextArea area) {
        this.area = area;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();

        switch(buttonPressed) {
            case "Seleziona un File": {
                JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                int returnValue = jfc.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    inputPath = selectedFile.getAbsolutePath();
                    featurelist = readFile();
                }
                break;
            }

            case "Stampa Dati": {
                if(inputPath != null){
                    area.setText("");

                    for(Feature f : featurelist){
                        FeatureProperties properties = f.getProperties();

                        area.append(properties.toString());
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Nessun file selezionato");
                }

                break;
            }

            case "Disegna Grafico Dati": {
                if(inputPath != null){
                    int frameWidth = 900;
                    int frameHeight = 800;

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            JFXApplication jfx = new JFXApplication(featurelist,frameWidth,frameHeight);
                            jfx.initAndShowChart();
                        }
                    });

                } else {
                    JOptionPane.showMessageDialog(null, "Nessun file selezionato");
                }
                break;
            }

        }
    }

    private ArrayList<Feature> readFile(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Feature> featurelist = null;

        try {
            JsonReader reader = new JsonReader(new FileReader(inputPath));

            FeatureCollection featureCollection = gson.fromJson(reader, FeatureCollection.class);

            featurelist = featureCollection.getFeatures();



        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return featurelist;
    }
}