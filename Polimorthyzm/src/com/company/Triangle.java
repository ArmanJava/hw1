package com.company;

public class Triangle extends Shape{



    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public Double getarea(int height, int weight, double radius) {
        area=(height*weight)/2;

        return area;
    }



}
