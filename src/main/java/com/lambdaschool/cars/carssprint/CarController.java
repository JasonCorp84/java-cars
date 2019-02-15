package com.lambdaschool.cars.carssprint;

import lombok.extern.slf4j.Slf4j;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;


import java.util.Comparator;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController

public class CarController {
    private final CarRepo carRepos;
    private final RabbitTemplate rt;

    public CarController(CarRepo carRepos, RabbitTemplate rt) {
        this.carRepos = carRepos;
        this.rt = rt;
    }
    @GetMapping("cars/id/{id}")
    public List<Car> catById(@PathVariable Long id) {
        return carRepos.findById(id).stream().collect(Collectors.toList());
    }

    @PostMapping("/cars/upload")
    public List<Car> newCountry(@RequestBody List<Car> newCountries){
        return carRepos.saveAll(newCountries);
    }
}
