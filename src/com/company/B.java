package com.company;

public class B extends A {

    protected void myFun(String s) {
        System.out.println("b1.myFun"+s);
    }


    protected void myFun(int s) {
        System.out.println("b2.myFun"+s);
    }

    public void abc(String s){
        System.out.println("abc"+s);
    }
}
