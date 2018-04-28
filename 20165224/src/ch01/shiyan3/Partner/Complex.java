public class Complex {
    private double a;
    private double b;

    public Complex() {
        this.setA(0);
        this.setB(0);
    }

    public Complex(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double setA(double a) {
        this.a = a;
        return a;
    }

    public double setB(double b) {
        this.b = b;
        return b;
    }

    Complex ComplexAdd(Complex c) {
        double a = c.getA();
        double b = c.getB();
        double newA = a + this.getA();
        double newB = b + this.getB();
        Complex Result = new Complex(newA, newB);
        return Result;
    }

    Complex ComplexMinus(Complex c) {
        double a = c.getA();
        double b = c.getB();
        double newA = a - this.getA();
        double newB = b - this.getB();
        Complex Result = new Complex(newA, newB);
        return Result;
    }

    Complex ComplexMulti(Complex c) {
        double a = c.getA();
        double b = c.getB();
        double newA = a * this.getA();
        double newB = b * this.getB();
        Complex Result = new Complex(newA, newB);
        return Result;
    }

    Complex ComplexDiv(Complex c) {
        double a = c.getA();
        double b = c.getB();
        double newA = a / this.getA();
        double newB = b / this.getB();
        Complex Result = new Complex(newA, newB);
        return Result;
    }

    public String toString() {
        String s = " ";
        if (getB() > 0)
            s = getA() + "+" + getB() + "i";
        if (getB() == 0)
            s = getA() + "";
        if (getB() < 0)
            s = getA() + " " + getB() + "i";
        return s;
    }
}
