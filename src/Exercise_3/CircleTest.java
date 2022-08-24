package Exercise_3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Radius of the circle is " + circle.getRadius());
        circle.setRadius(5);
        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The colour of the circle is " + circle.getColour());
        circle.setColour("Blue");
        System.out.println("The colour of the circle is " + circle.getColour());
    }
}
