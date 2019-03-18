package com.mypolynomial;


import java.util.Arrays;

public class MyPolynomial {

    private  double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;

    }

    public int getDegree() {
        return coeffs.length -1;
    }

    @Override
    public String toString() {
        /*System.out.println("toString: ");
        System.out.println("MyPolynomial{" + "coeffs=" + Arrays.toString(coeffs) + '}');*/
        String polynom = "";
        for (int i = 0; i < coeffs.length - 1; i++) {

            int coef = (int)coeffs[coeffs.length - i - 1];
            polynom += coef + "" + "x^" + (getDegree() - i) + " + ";
        }
        return polynom + ""+ (int)coeffs[0];
    }



    public double evaluate(double x) {
        double evaluate = 0;
        for (int i = coeffs.length; i > 1; i--) {
            evaluate += coeffs[i-1] * Math.pow(x, i-1);
        }
        return  evaluate;
    }

    public MyPolynomial add(MyPolynomial right) {
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = coeffs[i] + right.coeffs[i];
            System.out.println(coeffs[i]);
        }
        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        return  myPolynomial;
    }

    public MyPolynomial multipy(MyPolynomial right) {
        double mult = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            mult = this.coeffs[i] * right.coeffs[i];
        }
            for (int j = 0; j <right.coeffs.length ; j++) {
                coeffs[j] = this.coeffs[j] * right.coeffs[j];
                //System.out.println(mult + "x^"  );

            }


        MyPolynomial myPolynomial = new MyPolynomial(coeffs);
        return  myPolynomial;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyPolynomial)) return false;
        MyPolynomial equal = (MyPolynomial) obj;
        return Arrays.equals(coeffs, equal.coeffs);
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (int i = 0; i <coeffs.length ; i++) {
            result += 31 * result + (int)Double.doubleToLongBits(coeffs[i]);
        }
        return result;
    }

}
