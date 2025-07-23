package com.superpets.missionservice.controllers;

import com.superpets.missionservice.models.Mission;
import com.superpets.missionservice.repositories.MissionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionRepository missionRepository;

    public MissionController(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    @GetMapping
    public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mission getMissionById(@PathVariable Long id) {
        return missionRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Mission createMission(@RequestBody Mission mission) {
        return missionRepository.save(mission);
    }
}