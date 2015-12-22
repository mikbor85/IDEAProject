package com.example.java.model;

public enum OliveName {

    KALAMATA("Kalamata"), LANGURIAN("Ligurian"), OLIVKA("Olivka");

    private String name;
    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
