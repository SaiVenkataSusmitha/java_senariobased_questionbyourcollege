import java.util.Scanner;

abstract class Shape {
	abstract double area();
	// Concrete method shared by all subclasses
	void display() {
        	System.out.printf("Area of %s = %.2f%n", getClass().getSimpleName(), area());
    	}
}

class Circle extends Shape {
	double radius;

    	Circle(double radius) {
        	this.radius = radius;
    	}

    	double area() {
        	return Math.PI * radius * radius;
    	}
}

class Rectangle extends Shape {
	double length, width;

    	Rectangle(double length, double width) {
        	this.length = length;
        	this.width = width;
    	}

    	double area() {
        	return length * width;
    	}
}

class Triangle extends Shape {
	double base, height;

    	Triangle(double base, double height) {
        	this.base = base;
        	this.height = height;
    	}

    	double area() {
        	return 0.5 * base * height;
    	}
}

public class ShapeAreaDemo {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter radius of circle: ");
        	double r = sc.nextDouble();

        	System.out.print("Enter length and width of rectangle: ");
        	double l = sc.nextDouble();
        	double w = sc.nextDouble();

        	System.out.print("Enter base and height of triangle: ");
        	double b = sc.nextDouble();
        	double h = sc.nextDouble();

        	// Array of the abstract type holding different subclass objects
        	Shape[] shapes = {
            		new Circle(r),
            		new Rectangle(l, w),
            		new Triangle(b, h)
        	};

        	System.out.println("\n--- Areas ---");
        	for (Shape s : shapes) {
            	s.display();
        	}

        	sc.close();
    	}
}