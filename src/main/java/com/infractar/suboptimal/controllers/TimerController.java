package com.infractar.suboptimal.controllers;

import com.infractar.suboptimal.services.ScrambleGeneratorImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/timer/")
public class TimerController {
    private final ScrambleGeneratorImpl _scrambleService;

    public TimerController(ScrambleGeneratorImpl scrambleService) {
        _scrambleService = scrambleService;
    }

    @GetMapping(path = "scrambles/{puzzle}/{n}/")
    public List<String> getScrambles(@PathVariable String puzzle, @PathVariable int n){
        return _scrambleService.scrambleSet(puzzle, n);
    }
}
