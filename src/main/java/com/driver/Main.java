package com.driver;

public static class A{
    public static String meth(){

        return "Invoking method from class A";
    }
}
public static class B extends A{
    public String meth() {

        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args){
//        B objB = new B();
//        System.out.println(objB.meth());
    }
}