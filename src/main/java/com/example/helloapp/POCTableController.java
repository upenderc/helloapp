package com.example.helloapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class POCTableController {

    private final DataManager dataManager;
    @Autowired
    public POCTableController(DataManager dm) {
        this.dataManager=dm;
    }
    @GetMapping("/mockList")
    public List<POCTable> mockData() {
        return dataManager.getMockData(40000);
    }
}
