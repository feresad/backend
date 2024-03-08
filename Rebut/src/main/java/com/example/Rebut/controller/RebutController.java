package com.example.Rebut.controller;


import com.example.Rebut.Repository.RebutRepository;
import com.example.Rebut.entity.Rebut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rebut")

public class RebutController {
    @Autowired
    private RebutRepository rebutRepository;

    @GetMapping("/all")
    public Iterable<Rebut> getAllRebut(){
        return rebutRepository.findAll();
    }
    @PutMapping("/{id}")
    public Rebut updateRebut(@PathVariable(name = "id") Long id, @RequestBody Rebut rebut){
        rebut.setId(id);
        return rebutRepository.save(rebut);
    }
}