package com.company;

public class LengthExceptin extends Exception {

    public int stringLength;

    public LengthExceptin(String message, int stringLength) {
        super(message);
        this.stringLength = stringLength;
    }

}
