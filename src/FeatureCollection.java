package com.infCapraraZhou;

import java.util.ArrayList;

public class FeatureCollection {
    private String type;
    private String name;
    private Crs crs;
    private ArrayList<Feature> features;

    public FeatureCollection(String type, String name, Crs crs, ArrayList<Feature> features){
        this.type = type;
        this.name = name;
        this.crs = crs;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Crs getCrs() {
        return crs;
    }

    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
}
