//Superclass box...
class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor of the superclass
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Volume calculation...
    double volume() {
        return width * height * depth;
    }
}