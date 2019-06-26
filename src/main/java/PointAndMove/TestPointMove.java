package PointAndMove;

public class TestPointMove {
    public static void main(String[] args) {
        Point point = new Point(5 ,5);
        System.out.println(point);
        point.getXY();
        point.setXY(2,5);
        System.out.print(point);

        MoveablePoint point2 = new MoveablePoint();
        point2.setSpeed(10,5);
        System.out.println(point2);
        MoveablePoint point1 = new MoveablePoint(100,200,4,6);
        point1.move();
        System.out.println(point1);


    }
}
