// Sub class - 2
// Shipment class extending BoxWeight class...
class Shipment extends BoxWeight {
    double cost;

    // Sub class - 2 constructor
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // calling superclass constructor
        cost = c;
    }
}