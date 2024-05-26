package com.example.smarthome.controller;

import com.example.smarthome.entity.Routine;
import com.example.smarthome.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/routines")
public class RoutineController {

    @Autowired
    private RoutineService routineService;

    @PostMapping
    public ResponseEntity<Routine> createRoutine(@RequestBody Routine routine) {
        return ResponseEntity.ok(routineService.createRoutine(routine));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Routine> getRoutineById(@PathVariable Long id) {
        Optional<Routine> routine = routineService.getRoutineById(id);
        return routine.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Routine>> getAllRoutines() {
        return ResponseEntity.ok(routineService.getAllRoutines());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Routine> updateRoutine(@PathVariable Long id, @RequestBody Routine routine) {
        Routine updatedRoutine = routineService.updateRoutine(id, routine);
        if (updatedRoutine != null) {
            return ResponseEntity.ok(updatedRoutine);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoutine(@PathVariable Long id) {
        routineService.deleteRoutine(id);
        return ResponseEntity.noContent().build();
    }
}