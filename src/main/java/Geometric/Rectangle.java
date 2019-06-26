package Geometric;

import Geometric.Geometric;

public class Rectangle extends Geometric {
    private double width, height;
    public Rectangle(){

    }

    public Rectangle(double width,double height,String color, String filled){
            this.width = width;
            this.height = height;

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setWidth (double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double Area(){
        return width*height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2 * ( height + width);
    }
}
