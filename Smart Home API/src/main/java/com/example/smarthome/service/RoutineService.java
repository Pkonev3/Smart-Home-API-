package com.example.smarthome.service;

import com.example.smarthome.entity.Routine;

import java.util.List;
import java.util.Optional;

public interface RoutineService {
    Routine createRoutine(Routine routine);
    Optional<Routine> getRoutineById(Long id);
    List<Routine> getAllRoutines();
    Routine updateRoutine(Long id, Routine routine);
    void deleteRoutine(Long id);
}