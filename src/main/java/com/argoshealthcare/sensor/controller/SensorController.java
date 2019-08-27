/*
    To do: Implement some Update CRUD operation.
*/

package com.argoshealthcare.sensor.controller;

import java.util.List;

import com.argoshealthcare.sensor.model.Sensor;
import com.argoshealthcare.sensor.service.SensorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorController {
    
    @Autowired
    private SensorService sensorService;

    @RequestMapping("/create")
    public String create(@RequestParam String date, @RequestParam String time, @RequestParam String local) {
        Sensor sensor = sensorService.create(date, time, local);
        return sensor.toString();
    }

    @RequestMapping("/xuxu")
    public String xuxul(){
        return "Te Amo";
    }

    @RequestMapping("/getAll")
    public List<Sensor> xuxu(){
        return sensorService.getAll();
    }

    @RequestMapping("/getById")
    public Sensor getById(@RequestParam String id){
        return sensorService.getById(id).get();
    }

    @RequestMapping("/getByDate")
    public List<Sensor> getByDate(@RequestParam String date){
        return sensorService.getByDate(date);
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String id){
        sensorService.delete(id);
        return "Deleted document with id: " + id;
    }
}