public class Complex {
    private double real;
    private double imaginary;


    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex a){
        return new Complex(  this.real + a.getReal(), + this.imaginary + a.getImaginary());
    }

    public Complex sub(Complex a){
        return new Complex(this.real - a.getReal(), + this.imaginary - a.getImaginary());
    }

}
class TestComplex{
    public static void main(String[] args) {
        Complex a = new Complex(1.33, 4.64);
        Complex b = new Complex(3.18, 2.74);
        Complex c = a.add(b);

        System.out.println("c=a+b " + c.getReal() + " " + c.getImaginary());
        Complex d = c.sub(a);
        System.out.println("d=c-a " + d.getReal() + " " + d.getImaginary());
    }
}


