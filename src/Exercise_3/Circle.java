package Exercise_3;

public class Circle {

    private double radius;
    private String colour;

    protected Circle() {
        this.radius = 1.0;
        this.colour = "red";
    }

    protected double getArea() {
        return (Math.pow(radius, 2)) * Math.PI;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected void setColour(String colour) {
        this.colour = colour;
    }

    protected String getColour(){
        return colour;
    }

}
