package com.company;

public class CreateFigure {
    public static void createFigure(int height, int weight,double radius,String figure){

        if(figure.equals("Triangle")){
            Shape triangle = new Triangle();
            System.out.println("Radius = "+triangle.getarea(height,weight,radius)+" "+triangle.getName());

        }; if(figure.equals("Circle")){
            Shape circle = new Circle();
            System.out.println("Площадь = "+circle.getarea(height,weight,radius)+" "+circle.getName());

        };if(figure.equals("Square")){
            Shape square = new Square();
            System.out.println("Площадь = "+square.getarea(height,weight,radius)+" "+square.getName());

        };
    }
}
