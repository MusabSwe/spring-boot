package com.musab.spring_boot;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    // @PostMapping // for post request
    // @DeleteMapping // for delete request
    // @PutMapping // for update request
    @GetMapping // for get request
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getSoftwareEngineers();
    }
}
 