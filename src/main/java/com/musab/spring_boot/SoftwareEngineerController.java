package com.musab.spring_boot;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    // @PostMapping // for post request
    // @DeleteMapping // for delete request
    // @PutMapping // for update request
    @GetMapping // for get request
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Ahmed", "JS, Node, React, Tailwindcss"),
                new SoftwareEngineer(2, "Ali", "Java, spring, spring boot"));
    }
}
 