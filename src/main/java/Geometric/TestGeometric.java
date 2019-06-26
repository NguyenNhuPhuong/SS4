package Geometric;

public class TestGeometric {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("black");
        System.out.print("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The diameter is :" + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("a rectangle " + rectangle.toString());
        System.out.println(" the area is :" + rectangle.getArea());
        System.out.println("the perimeter is " + rectangle.getPerimeter());
    }
}
