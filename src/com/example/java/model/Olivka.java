package com.example.java.model;


public class Olivka extends Olive {
    public Olivka() {
        super(OliveName.OLIVKA, OliveColor.BLACK, 7);
    }

    @Override
    public String getOrigin() {
        return "Russia";
    }
}
