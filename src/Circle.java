public class Circle extends GeometricShape {
    private final double pi = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = pi * (radius * radius);
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * pi * radius;
        return perimeter;
    }

}