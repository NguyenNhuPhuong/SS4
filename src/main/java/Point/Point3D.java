package Point;

import java.sql.SQLOutput;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float Z) {
        this.z = Z;
    }

    public void setXYZ(float X, float Y, float Z) {
        setX(X);
        setX(Y);
        this.z = Z;
    }

    public float[] getXYZ() {
        float arr[] = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    public void display() {
        for (int i = 0; i < getXYZ().length; i++) {
            System.out.print(getXYZ()[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "Array info Point 3D is: "  +  " and " + super.toString();
    }
}
