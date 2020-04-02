package com.infCapraraZhou;

public class Feature {
    private String type;
    private FeatureProperties properties;
    private String geometry;

    public Feature (String type, FeatureProperties properties){
        this.type = type;
        this.properties = properties;
        this.geometry = "null";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FeatureProperties getProperties() {
        return properties;
    }

    public void setProperties(FeatureProperties properties) {
        this.properties = properties;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }
}
