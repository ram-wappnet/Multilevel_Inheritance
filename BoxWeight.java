// Sub class - 1
// BoxWeight class extending the box class...
class BoxWeight extends Box {
    double weight; // weight of box
    // Sub class -1 constructor

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // calling superclass constructor
        weight = m;
    }
}