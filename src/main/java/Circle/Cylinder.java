package Circle;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){

    }
    public Cylinder(double radius,double height){
        this.height = height;
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double CylinderVolume(){
        return Area()*height;
    }

    @Override
    public String toString() {
        return " CylinderVolume is: " + CylinderVolume() + " height is: " + getHeight() + " radius is : " + getRadius() + super.toString();
    }
}
