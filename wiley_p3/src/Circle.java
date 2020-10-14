public class Circle implements Shape {
    private double radius;
    private double area;
    private String name;

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.name = "circle";
    }

    public double getArea() {
        double rounded;
        double pi = Math.PI;
        area = pi * radius * radius;
        rounded = Math.round(area * 100)/100d;
        return rounded;
    }

    public String getName() {
        return name;
    }
}