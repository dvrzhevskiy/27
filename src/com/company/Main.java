package com.company;

public class Main {


        public static void main(String[] args) {
        try {
            checkLength( args[0]  );
        } catch (LengthExceptin g) {
            System.out.println("g.stringLength = " + g.stringLength);
            System.out.println("g.getMessage() = " + g.getMessage());
            g.printStackTrace();

        }
    }


    private static void checkLength(String s) throws LengthExceptin{
        if (s.length() < 2) {
            LengthExceptin le =
                    new LengthExceptin("incorrect string length", s.length());

            throw le;

        }
    }
}
