package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private String data = "";
    private double spinSpeed = 200;
    private int capacity = 700;
    private String contents = "";

    // TODO: Implement your custom interface.

    public CD(String aName){
        super(aName, 700);
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
        System.out.println("A CD spins at a rate of " + 200 + " - " + 500 + " rpm.");
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
