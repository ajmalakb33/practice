package com.ajmal.interfaces.multiple;

public class Main {
    public static void main(String[] args) {
        Interface2 interface2 = new ImplementMultiple();
        interface2.printDetails();
        //Error compile time
        //interface2.getDetails();
    }

}
