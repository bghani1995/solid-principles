package com.cydeo.solid.liskovSubstitution.example.good;

import com.cydeo.solid.liskovSubstitution.example.bad.Rectangle;

import java.util.Arrays;
import java.util.List;

    public class MyApp {

        public static void main(String[] args) {

            com.cydeo.solid.liskovSubstitution.example.bad.Rectangle rectangle = new com.cydeo.solid.liskovSubstitution.example.bad.Rectangle();
            rectangle.setHeight(3);
            rectangle.setWidth(5);


            Square square = new Square();
            square.setSide(4);

            List<Rectangle> rectangles = Arrays.asList(rectangle, square);

            changeHeightAndWidth(rectangles);

        }

        public static void changeHeightAndWidth(List<com.cydeo.solid.liskovSubstitution.example.bad.Rectangle> rectangles) {

            for (Rectangle rectangle : rectangles) {
                rectangle.setHeight(5);
                rectangle.setWidth(6);
                System.out.println(rectangle.getArea() == 30);
            }

        }
}
