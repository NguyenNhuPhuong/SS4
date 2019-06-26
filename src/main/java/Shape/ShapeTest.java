package Shape;


import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape(false, "red");
        System.out.println(shape1);

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);

        Circle circle = new Circle(false, "pink", 2);
        System.out.println(circle);

        Scanner sc = new Scanner(System.in);
        boolean repeatSidesInput = true;
        do {
            System.out.println("Enter  three edge of the triangle: ");
            System.out.println("Nhap canh 1");
            double a = sc.nextDouble();
            System.out.println("Nhap canh 2");
            double b = sc.nextDouble();
            System.out.println("Nhap canh 3");
            double c = sc.nextDouble();
            try {
                Triangle triangle1 = new Triangle(a, b, c);
                System.out.println(triangle1);
                repeatSidesInput = false;
            } catch (IllegalTriangleException ex) {
                System.out.println("Exception!!!");
            }

        } while (repeatSidesInput);
    }

}
