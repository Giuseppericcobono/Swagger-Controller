package com.example.controller_get_post.controllers;


import com.example.controller_get_post.entities.NameEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    NameEntity nameEntity;

    @GetMapping("/{name}")
    public String username(@PathVariable String name) {
        nameEntity.setName(name);
        return nameEntity.getName();
    }

    @PostMapping("/reverse/{name}")
    public String reverseName(@PathVariable String name) {
        nameEntity.setName(name);
        return new StringBuilder(nameEntity.getName()).reverse().toString();
    }
}
