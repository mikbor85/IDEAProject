package com.example.java.model;

public class Langurian extends Olive {
    public Langurian() {
        super(OliveName.LANGURIAN, OliveColor.GREEN, 2);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}

