package com.iss.demo;

public abstract  class Shape {

	public abstract double getArea();
    
    public abstract double getPerimeter();
} 
    class Circle extends Shape {
    
    private double radius;
     
    public Circle(double radius) {
        this.radius = radius;
    }
 
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
 
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
 
class Rectangle extends Shape {
     
    private double width;
     
    private double height;
     
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
 
    @Override
    public double getArea() {
        return width * height;
    }
 
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}