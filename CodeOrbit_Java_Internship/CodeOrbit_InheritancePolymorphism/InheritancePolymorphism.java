// Demonstrates inheritance, method overriding, and runtime polymorphism.
abstract class Shape {
    // Every concrete shape must provide its own area calculation.
    public abstract double area();

    public void display() {
        System.out.printf("%s area: %.2f%n", getClass().getSimpleName(), area());
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method overriding: Circle provides its own implementation of area().
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        // A Shape reference can point to different subclass objects.
        Shape[] shapes = {
            new Circle(3),
            new Square(4),
            new Triangle(6, 2)
        };

        // Runtime polymorphism calls the correct overridden area() method.
        for (Shape shape : shapes) {
            shape.display();
        }
    }
}
