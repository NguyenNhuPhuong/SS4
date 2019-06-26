package Shape;

public class IllegalTriangleException extends Exception {
    private double edgeOne;
    private double edgeTow;
    private double edgeThree;

    public IllegalTriangleException(double edgeOne, double edgeTow, double edgeThree) {
        super("Illegal Triangle : " + edgeOne + " " + edgeTow + " " + edgeThree);
        this.edgeOne = edgeOne;
        this.edgeTow = edgeTow;
        this.edgeThree = edgeThree;
    }

}
