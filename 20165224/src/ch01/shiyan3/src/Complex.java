class Complex {
    private double a;
    private double b;
    public Complex(){
        this.a = 0;
        this.b = 0;
    }
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public  double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double setA(double a){
        this.a = a;
        return a;
    }
    public double setB(double b){
        this.b = b;
        return b;
    }
    Complex ComplexAdd(Complex c){
        double a = c.getA();
        double b = c.getB();
        double newA = a + this.a;
        double newB = b + this.b;
        Complex Result = new Complex(newA,newB);
        return Result;
    }
    Complex ComplexMinus(Complex c){
        double a = c.getA();
        double b = c.getB();
        double newA = a - this.a;
        double newB = b - this.b;
        Complex Result = new Complex(newA,newB);
        return Result;
    }
    Complex ComplexMulti(Complex c){
        double a = c.getA();
        double b = c.getB();
        double newA = a * this.a;
        double newB = b * this.b;
        Complex Result = new Complex(newA,newB);
        return Result;
    }
    Complex ComplexDiv(Complex c){
        double a = c.getA();
        double b = c.getB();
        double newA = a / this.a;
        double newB = b / this.b;
        Complex Result = new Complex(newA,newB);
        return Result;
    }
    public String toString() {
        String s = " ";
        if (b > 0)
            s =  a + "+" + b + "i";
        if (b == 0)
            s =  a + "";
        if (b < 0)
            s = a + " " + b + "i";
        return s;
    }
}
