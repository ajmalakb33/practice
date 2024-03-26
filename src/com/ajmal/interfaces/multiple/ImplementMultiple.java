package com.ajmal.interfaces.multiple;

public class ImplementMultiple implements Interface1, Interface2 {
    @Override
    public void printDetails() {
        System.out.println("This is implemenbetation");
    }

    public void getDetails() {
        System.out.println("getting details");
    }
}
