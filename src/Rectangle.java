public class Rectangle extends GeometricShape {
    private double side1;
    private double side2;

    Rectangle (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getArea() {
        double area = side1 * side2;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (side1 * 2) + (side2 * 2);
        return perimeter;
    }

}