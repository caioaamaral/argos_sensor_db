package com.argoshealthcare.sensor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.argoshealthcare.sensor.model.Sensor;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String>{
    public Optional<Sensor> findById(String id);
    public List<Sensor> findByDate(String date);
    public List<Sensor> findByTime(String time);
    public List<Sensor> findByLocal(String local);

}