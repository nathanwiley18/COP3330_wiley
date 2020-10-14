public class Pyramid implements Shape,Shape3D {
    private double length;
    private double width;
    private double height;
    private String name;

    public Pyramid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = "pyramid";
    }

    public double getArea() {
        double area;
        double rounded;
        area = (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) +
                Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));
        rounded = Math.round(area * 100)/100d;
        return rounded;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return ((length * width) * height) / 3;
    }
}