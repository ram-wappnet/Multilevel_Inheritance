class A {
    protected int x = 10;
    protected int y = 20;
}

class B extends A {
    // x can be accessed from this class
    public void showx() {
        System.out.println("Value of x  From B Class-:" + x);
    }
}

class C extends B {
    // y can be accessed from this class
    public void showy() {
        System.out.println("Value of y  From C Class-:" + y);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.showx();
        obj1.showy();
    }
}