public class Sphere implements Shape, Shape3D {

    private double radius;
    private double pi = Math.PI;
    private String name;

    public Sphere(double radius) {
        super();
        this.radius = radius;
        this.name = "sphere";
    }

    public String getName() {
        return name;
    }
    public double getArea() {
        double roundedA;
        double area;
        area = (4 * pi * radius * radius);
        roundedA = Math.round(area * 100)/100d;
        return roundedA;
    }

    public double getVolume() {
        double roundedV;
        double volume;
        volume = ((4/3) * pi *(radius * radius * radius));
        roundedV = Math.round(volume * 100)/100d;
        return roundedV;
    }
}