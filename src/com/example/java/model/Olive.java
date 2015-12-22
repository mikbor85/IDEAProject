package com.example.java.model;


public abstract class Olive {

    private OliveName name;
    private long color;
    private int oil;

    public Olive(OliveName name, OliveColor color, int oil ){
        this.name = name;
        this.oil = oil;
    }

    public OliveName getName() {return name;}

    public void setName(OliveName name) {this.name = name;}

    public long getColor() {return color;}

    public void setColor(long color) {this.color = color;}

    public int crush() {
        String msg = name  + ", from " + getOrigin() +
                ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }
    public void setOil(int oil) {this.oil = oil;}
    public abstract String getOrigin();
    

}
