package com.example.trofeo.abstractfactorypattern;

public class Tomato implements Filling{
    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public String calories() {
        return ": 20 kcal";
    }
}