package Shape;

public class Rectangle extends Shape{
    private double height =1 , width = 1;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + getHeight() +
                ", width=" + getWidth() +
                '}'+
                "which is a subclass of "
                + super.toString();
    }
}
