package com.driver;


public class A {
    public String meth(){
        return "Invoking method from class A";
    }
}
public class B extends A{
    @Override
    public String meth() {
        return "Method is overridden in Extendend class B;
    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();
        System.out.println(obj.meth());

//        B b1 = new B();
//        b1.meth();
    }
}