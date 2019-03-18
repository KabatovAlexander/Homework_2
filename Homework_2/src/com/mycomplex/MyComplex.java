package com.mycomplex;


public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(real + image i): " + real + "+" + imag + "i";
    }

    public boolean isReal() {
        if (this.real > 0 || this.real < 0) return true;
        else return false;
    }

    public boolean isImag() {
        if (this.imag > 0 || this.imag < 0) return true;
        else return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MyComplex)) {
            return false;
        }
        MyComplex myComplex = (MyComplex) o;
        return myComplex.real == real && myComplex.imag == imag;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longValue = Double.doubleToLongBits(real);
        result = 37 * result + (int) (Math.pow(longValue, (longValue >>> 32)));
        longValue = Double.doubleToLongBits(imag);
        result = 37 * result + (int) (Math.pow(longValue, (longValue >>> 32)));
        return result;
    }

    public double magnitude() {
        double module = Math.sqrt((Math.pow(this.real , 2)) + Math.pow(this.imag, 2));
        return module;
    }

    public double argument() {
        double tanFi = imag/real;
        return Math.atan(tanFi);
    }

    // следующие 4 метода возвращают новый обж, надо подумать как записывать сумму в this!!!

    public MyComplex add(MyComplex right) {
        real = real + right.real;
        imag = imag + right.imag;
        return  this;
    }

    public MyComplex subtract(MyComplex right) {
        real = this.real - right.real;
        imag = this.imag - right.imag;
        return  this;
    }

    public MyComplex multiply(MyComplex right) {
        real = this.real * right.real;
        imag = this.imag * right.imag;
        return  this;
    }
    public MyComplex divide(MyComplex right) {
        real = this.real / right.real;
        imag = this.imag / right.imag;
        return  this;
    }
    ////////////////////////////////
    public MyComplex addNew(MyComplex right) {
        double sumReal = this.real + right.real;
        double sumImag = this.imag + right.imag;
        MyComplex myComplex = new MyComplex(sumReal, sumImag);
        return  myComplex;
    }

    public MyComplex subtractNew(MyComplex right) {
        double subtractReal = this.real - right.real;
        double subtractImag = this.imag - right.imag;
        MyComplex myComplex = new MyComplex(subtractReal, subtractImag);
        System.out.println("This instance: " + this.real + " " + this.imag);
        return  myComplex;
    }

    public MyComplex conjugate() {
        System.out.println(real +" " + imag);
        MyComplex myComplex = new MyComplex(real, -(imag));
        return  myComplex;
    }
}
