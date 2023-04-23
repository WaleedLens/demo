package com.swe206.group_two.backend.sport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SportController {

    private final SportService service;

    public SportController(SportService service){
        this.service = service;
    }

    @GetMapping("test")
    public void t(){
        System.out.println(service.tos(1).getName());
    }
}
