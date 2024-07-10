package com.example.controller_get_post.entities;

import org.springframework.stereotype.Component;

@Component
public class NameEntity {

    private String name;

    public NameEntity() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
