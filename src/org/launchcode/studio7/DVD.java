package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    private String data = "";
    private double spinSpeed = 570;
    private int capacity = 4800000;
    private String contents = "";

    // TODO: Implement your custom interface.

    public DVD(String aName){
        super(aName, 4800000);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public void storeData(String aString){
        burnDisc(aString);
    }

    public String readData(){
        return ripDisc();
    }

    public double spinDisc(){
        System.out.println("A DVD spins at a rate of " + 570 + " - " + 1600 + " rpm.");
        return spinSpeed;
    }

    public void burnDisc(String aString){
        System.out.println("Burning Data to disk...");
        this.data += aString;
    }

    public String ripDisc(){
        System.out.println("Copying data from disk...");
        return data;
    }



}
