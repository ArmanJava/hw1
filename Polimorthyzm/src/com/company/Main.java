package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Введите height");
            int height = Integer.parseInt(reader.readLine());
                        System.out.println("Введите weight");
            int weight = Integer.parseInt(reader.readLine());
        double radius=0;
        System.out.println("Введите фигуру Triangle или Circle или Square");
        String figure = reader.readLine();
             if(figure.equals("Circle")){
                 System.out.println("Введите radius Круга");
                  radius = Integer.parseInt(reader.readLine());
             }
        CreateFigure.createFigure(height,weight,radius,figure);

    }
}
