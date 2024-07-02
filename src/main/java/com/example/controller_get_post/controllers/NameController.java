package com.example.controller_get_post.controllers;


import com.example.controller_get_post.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    NameService nameService;

    @GetMapping("/{name}")
    public String username(@PathVariable String name) {
        nameService.setName(name);
        return nameService.getName();
    }

    @PostMapping("/reverse/{name}")
    public String reverseName(@PathVariable String name) {
        nameService.setName(name);
        return new StringBuilder(nameService.getName()).reverse().toString();
    }
}
