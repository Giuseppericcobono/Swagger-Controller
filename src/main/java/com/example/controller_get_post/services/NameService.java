package com.example.controller_get_post.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    private String name;

    public NameService() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
