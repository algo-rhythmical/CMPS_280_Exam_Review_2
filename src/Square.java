public class Square extends GeometricShape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        double area = sideLength * sideLength;
        return area;
    }

    public double getPerimeter() {
        double perimeter = sideLength * 4;
        return perimeter;
    }

}
