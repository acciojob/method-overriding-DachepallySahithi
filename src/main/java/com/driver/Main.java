package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @java.lang.Override
    public String meth() {
        return "Method is overridden in Extended class B";
        return super.meth();
    }
}
public class Main {
    public static void main(String[] args){
        B obj = new B();
        System.out.println(obj.meth());
    }
}