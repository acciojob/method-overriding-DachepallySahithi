package com.driver.test;

// import static org.junit.Assert.*;
// import org.junit.jupiter.api.Test;

public class TestCases {
    
}

class A {
    public String meth(){
        return "Invoking method from class A";

    }
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}
