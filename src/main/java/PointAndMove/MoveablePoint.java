package PointAndMove;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float arr1[] = new float[2];
        arr1[0] = xSpeed;
        arr1[1] = ySpeed;
        return arr1;
    }

    @Override
    public String toString() {
        return super.toString() + " X speed is: " + xSpeed + " Y speed is: " + ySpeed;
    }

    public  void move() {
        super.x += xSpeed;
        super.y += ySpeed;
    }
}
