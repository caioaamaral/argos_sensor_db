package com.argoshealthcare.sensor.service;

import java.util.List;
import java.util.Optional;

import com.argoshealthcare.sensor.model.Sensor;
import com.argoshealthcare.sensor.repository.SensorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    //Create
    public Sensor create(String date, String time, String local){
        return sensorRepository.save(new Sensor(date, time, local));
    }
    //Retrieve
    public List<Sensor> getAll(){
        return sensorRepository.findAll();
    }
    public Optional<Sensor> getById(String id){
        return sensorRepository.findById(id);
    }

    public List<Sensor> getByDate(String date){
        return sensorRepository.findByDate(date);
    }

    public List<Sensor> getByTime(String time){
        return sensorRepository.findByTime(time);
    }

    public List<Sensor> getByLocal(String local){
        return sensorRepository.findByLocal(local);
    }
    //Update
    public Sensor updateLocal(String id, String local){
        Sensor sensor = getById(id).get();
        sensor.setLocal(local);
        return sensorRepository.save(sensor);
    }
    //Delete
    public void deleteAll(){
        sensorRepository.deleteAll();
    }
    
    public void delete(String id){
        Sensor sensor = getById(id).get();
        sensorRepository.delete(sensor);
    }

}