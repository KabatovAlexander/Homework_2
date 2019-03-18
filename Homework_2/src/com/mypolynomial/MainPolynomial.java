package com.mypolynomial;

public class MainPolynomial {

    public static void main(String[] args) {


        MyPolynomial myPolynomial = new MyPolynomial(1,2,3);
        MyPolynomial myPolynomial1 = new MyPolynomial(1,25,4);
        /*System.out.println(myPolynomial.equals(myPolynomial1));
        System.out.println(myPolynomial.toString());
        System.out.println(myPolynomial.getDegree());
        System.out.println(myPolynomial.evaluate(5));
        System.out.println("ADD");
        System.out.println(myPolynomial.add(new MyPolynomial(2,3,4)).toString());*/
        System.out.println("MULTIPLY");
        System.out.println(myPolynomial.multipy(myPolynomial1));



    }
}
