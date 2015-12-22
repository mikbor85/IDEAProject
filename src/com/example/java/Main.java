package com.example.java;

import com.example.java.model.*;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (IOException e){
        e.printStackTrace();
    }


    List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Langurian());
        olives.add(new Langurian());
        olives.add(new Olivka());
        olives.add(new Olivka());


        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);

        for (int i = 0; i < olives.size(); i++) {
            System.out.println("You got " + totalOil + " units of oil from:  " + olives.get(i).getOrigin());
        }

//        System.out.println("You got " + totalOil + " units of oil from:  " + olives.get(3).getOrigin() );
    }
    }