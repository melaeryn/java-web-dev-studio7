package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
         CD myCD = new CD("myCD");
         DVD myDVD = new DVD("myDVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(myCD.getName());
        System.out.println(myCD.getCapacity());
        myCD.storeData("Hello World");
        System.out.println(myCD.readData());
        myCD.spinDisc();


        System.out.println(myDVD.getName());
        System.out.println(myDVD.getCapacity());
        myDVD.storeData("Hello World");
        System.out.println(myDVD.readData());
        myDVD.spinDisc();
    }
}