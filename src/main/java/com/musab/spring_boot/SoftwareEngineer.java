package com.musab.spring_boot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer {
    @Id
    private Integer id;
    private String name;
    private String techStack;

    // constructor
    public SoftwareEngineer(Integer id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    // getter
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }

    // setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
}
