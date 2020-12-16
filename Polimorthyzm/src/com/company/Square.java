package com.company;

public class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public Double getarea(int height, int weight, double radius) {
        area = height*weight;
        return area;
    }
}
