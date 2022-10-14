import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for the radius of circle: ");

        GeometricShape g = new Circle(input.nextDouble());
        Circle c = (Circle)g;

        System.out.println("My circle's radius is :" + c.getRadius() +"\n"+
        "My circle's area is " +c.getArea()+ ", and the perimeter is " +c.getPerimeter()+ ".");

        System.out.print("Enter a number for side length of square: ");

        GeometricShape x = new Square(input.nextDouble());
        Square sq = (Square)x;

        System.out.println("our side length of the square is " +sq.getSideLength()+ ", " +
                "area of the square is " +sq.getArea()+ ", and perimeter is " +sq.getPerimeter());

        System.out.print("Enter 2 separate numbers for 1st side and 2nd(adjacent) side: ");
        GeometricShape t = new Rectangle(input.nextDouble(), input.nextDouble());
        Rectangle r = (Rectangle)t;

        System.out.println("our 1st side length of the rectangle is " +r.getSide1()+ ", " +
                "2nd side length is " +r.getSide2()+ ", the area is " +r.getArea()+ ", and perimeter is " +r.getPerimeter());
    }

}