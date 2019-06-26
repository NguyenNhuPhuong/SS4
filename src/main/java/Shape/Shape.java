package Shape;


public class Shape {
    private boolean filled = true;
    private String color = "greed";

    public String getColor() {
        return color;
    }

    public Shape() {
    }

    public Shape(boolean filled, String color) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
           return filled;
    }


    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? " filled": "notfilled") ;
    }
}
