package com.argoshealthcare.sensor.hardware;

public class SensorHardware{

    private String id;

     
    public SensorHardware(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

}