package com.iss.demo;

public class Main1 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
        System.out.println("圆面积：" + circle.getArea() + "，圆周长：" + circle.getPerimeter());
         
        Rectangle rect = new Rectangle(6, 9);
        System.out.println("矩形面积：" + rect.getArea() + "，矩形周长：" + rect.getPerimeter());
	}

}
