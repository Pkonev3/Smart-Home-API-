package com.example.smarthome.service.impl;

import com.example.smarthome.entity.Routine;
import com.example.smarthome.repository.RoutineRepository;
import com.example.smarthome.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoutineServiceImpl implements RoutineService {

    @Autowired
    private RoutineRepository routineRepository;

    @Override
    public Routine createRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    @Override
    public Optional<Routine> getRoutineById(Long id) {
        return routineRepository.findById(id);
    }

    @Override
    public List<Routine> getAllRoutines() {
        return routineRepository.findAll();
    }

    @Override
    public Routine updateRoutine(Long id, Routine routine) {
        if (routineRepository.existsById(id)) {
            routine.setId(id);
            return routineRepository.save(routine);
        }
        return null;
    }

    @Override
    public void deleteRoutine(Long id) {
        routineRepository.deleteById(id);
    }
}