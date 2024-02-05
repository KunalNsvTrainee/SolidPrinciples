package com.example.solidprinciples.SOLID;

public class AreaCalculate {
    public double getShapeArea(Shape shape) {
        return shape.getArea();
    }
}

interface Shape{
    public double getArea();
}

class Triangle implements Shape{
    double base;
    double height;
    public double getArea(){
        return (base * height)/2;
    }
}
class Square implements Shape{
    public double side;
    public double getArea(){
        return side * side;
    }
}

