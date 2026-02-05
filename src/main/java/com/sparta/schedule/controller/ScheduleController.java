package com.sparta.schedule.controller;


import com.sparta.schedule.dto.*;
import com.sparta.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request){
        CreateScheduleResponse result = scheduleService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping("/schedules/{scheduleId}")
    public ResponseEntity<GetOneScheduleResponse> getOneSchedule(@PathVariable Long scheduleId){
        GetOneScheduleResponse result = scheduleService.getOne(scheduleId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<GetOneScheduleResponse>> getAllSchedule(@RequestParam (required = false) String name){
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.getAll(name));
    }

    @PutMapping("/schedules/{scheduleId}")
    public ResponseEntity<UpdateScheduleResponse> updateSchedule(@PathVariable Long scheduleId, @RequestBody UpdateScheduleRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(scheduleService.update(scheduleId, request));
    }

    @DeleteMapping("/schedules/{scheduleId}")
    public ResponseEntity<Void> delete(@PathVariable Long scheduleId){
        scheduleService.delete(scheduleId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
