package Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point = new Point2D(7, 8);
        System.out.println(point);
        point.setX(6);
        point.setY(5);
        System.out.println(point);
        Point3D point1 = new Point3D();
        point1.setXY(4,5);
        point1.setZ(6);
        point1.getXYZ();
        System.out.println(point1);
        point1.display();
    }
}
