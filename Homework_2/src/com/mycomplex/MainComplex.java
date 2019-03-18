package com.mycomplex;

public class MainComplex {

    public static void main(String[] args) {

        MyComplex myComplex = new MyComplex(3, 0);
        MyComplex myComplex1 = new MyComplex(3,6);
        System.out.println(myComplex.getReal());
        System.out.println(myComplex.getImag());
        System.out.println(myComplex.toString());
        System.out.println("isReal: " + myComplex1.isReal());
        System.out.println("isImag: " +  myComplex1.isImag());
        System.out.println("Equals(double, double): " + myComplex1.equals(3,6));
        System.out.println("Equals(Object): " + myComplex.equals(new MyComplex(3,4)));
        System.out.println(myComplex.magnitude());
        System.out.println(myComplex1.argument());
        System.out.println("Сумма: " + myComplex1.add(new MyComplex(5,6)));
        System.out.println("Разность: " + myComplex.subtract(new MyComplex(6,25)));
        System.out.println("Произведение: " + myComplex.multiply(new MyComplex(4,2)));
        System.out.println("Частное: " + myComplex.divide(new MyComplex(3,8)));
        MyComplex myComplex2 = new MyComplex(10,10);
        System.out.println("addNew: " + myComplex2.addNew(new MyComplex(4,3)));
        System.out.println("subtractNew: " + myComplex2.subtractNew(new MyComplex(6,25)));
        System.out.println("Сопряжение: " + myComplex2.conjugate());
        }
}
