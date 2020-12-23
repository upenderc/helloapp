package com.example.helloapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataManager {

    public List<POCTable> getMockData(int batchSize) {
        List<POCTable> pocTables = new ArrayList<>();
        for(int i=1;i<=batchSize;i++) {
            pocTables.add(POCTable.builder().build());
        }
        return pocTables;
    }
}
