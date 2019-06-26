package PointAndMove;

public class Point {
    public float x, y;
    public Point(){

    }
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY (float x, float y){
        this.y = y;
        this.x = x;
    }
    public float[] getXY(){
        float arr[] = new float[2];
        arr[0] = x;
        arr[1] = y;
        return  arr;
    }

    @Override
    public String toString() {
        return  "Infor point is : "  + "(" + x + ", " + y + ")";
    }
}
