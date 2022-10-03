package com.designpatterns.behavirol.template.houseexample;

public class HousingClient {

    public static void main(String[] args) {
        HouseTemplate houseTYpe = new WoodenHouse();
        houseTYpe.buildHouse();

        System.out.println("*******************************");

        houseTYpe = new GlassHouse();
        houseTYpe.buildHouse();
    }

}
