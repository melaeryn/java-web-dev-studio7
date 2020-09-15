package org.launchcode.studio7;

public abstract class BaseDisc {

    protected String name;
    protected int capacity;

    public BaseDisc(String aName, int capacity){
        this.name = aName;
        this.capacity = capacity;
    }

    public abstract void storeData(String data);

    public abstract String readData();

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
