package com.argoshealthcare.sensor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sensor {
    
    private
    @Id
    String id;
    String date;
    String time;
    String local;

    public Sensor (String date, String time, String local) {
        this.date = date;
        this.time = time;
        this.local = local;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Sensor [date=" + date + ", id=" + id + ", local=" + local + ", time=" + time + "]";
    }

    
}

