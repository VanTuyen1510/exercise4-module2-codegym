package Main4;

public class Circle {

    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius;
    }

    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }


    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();

            circle.radius = 1;
            System.out.println(circle.getRadius());

            circle.color = "red";
            System.out.println(circle.getColor());

        }
    }

}
