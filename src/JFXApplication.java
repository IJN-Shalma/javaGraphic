package com.infCapraraZhou;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JFXApplication {
    private ArrayList<Feature> featureList;
    private int frameWidth;
    private int frameHeight;

    public JFXApplication(ArrayList<Feature> featureList, int frameWidth, int frameHeight){
        this.featureList = featureList;
        this.frameHeight = frameHeight;
        this.frameWidth = frameWidth;
    }

    public void initAndShowChart(){
        JFrame fChart = new JFrame("Concentrazione NO2");
        JFXPanel fxPanel = new JFXPanel();

        fChart.add(fxPanel);
        fChart.setSize(frameWidth,frameHeight);
        fChart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fChart.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
        });
    }

    private void initFX(JFXPanel fxPanel){
        if (! Platform.isFxApplicationThread()) {
            throw new IllegalStateException("Not on FX Application Thread");
        }
        Scene scene = createScene();
        fxPanel.setScene(scene);
    }

    private Scene createScene() {
        HBox root  =  new HBox();
        Scene  scene  =  new  Scene(root);
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);

        bc.setTitle("Concentrazione di NO2 nell'aria");
        bc.getXAxis().lookup(".axis-label").setStyle("-fx-label-alignment: left;");
        xAxis.setLabel("Legenda");
        yAxis.setLabel("Valore (µg/m3)");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Media Annuale");

        try {
            for (Feature f:featureList) {
                FeatureProperties properties = f.getProperties();

                series1.getData().add(new XYChart.Data(properties.getName(), Double.parseDouble(properties.getConcentrazione_NO2_anno___g_m3())));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Media Mensile");

        try {
            for (Feature f:featureList) {
                FeatureProperties properties = f.getProperties();

                series2.getData().add(new XYChart.Data(properties.getName(), Double.parseDouble(properties.getConcentrazione_NO2_mese___g_m3())));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        bc.setPrefWidth(featureList.size()*50);
        bc.setPrefHeight(frameHeight-100);
        bc.getData().addAll(series1,series2);



        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(bc);
        HBox.setHgrow(scrollPane, Priority.ALWAYS);

        root.getChildren().addAll(scrollPane);
        return (scene);
    }
}
