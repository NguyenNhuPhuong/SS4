package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle(double radius, String color ){
        this.color = color;
        this.radius = radius;
    }
    public double Area (){
        return radius*Math.PI*radius;
    }
    public double Perimeter(){
        return 2*radius*Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "info circle which color is :" + getColor() +"and the radius is :" + getRadius();
    }
}
