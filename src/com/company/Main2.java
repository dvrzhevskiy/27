package com.company;

public class Main2 {
    static Animal first;

    public static void main(String[] args) {
        A a = new A();
        a.myFun("x");
        A b = new B();
        b.myFun("y");
         b.myFun(1);
         b.abc();


        first=new Animal();

        Animal a24 = new Animal();
        first.next=a24;

    }
    private void print(A x){
     x.myFun("ABC");
     x.myFun(1);
    }
}
