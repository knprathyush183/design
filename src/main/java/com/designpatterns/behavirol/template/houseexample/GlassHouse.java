package com.designpatterns.behavirol.template.houseexample;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building glass coated pillars");
    }
}
