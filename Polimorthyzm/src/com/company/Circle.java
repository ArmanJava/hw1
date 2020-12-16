package com.company;

public class Circle extends  Shape{
    double p =3.14;
    int radius;
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public Double getarea(int height, int weight, double radius) {
        area = p*(radius*radius);
        return area;
    }
}
