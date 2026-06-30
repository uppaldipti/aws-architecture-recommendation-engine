package com.cloud.archengine.architecture_engine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.archengine.architecture_engine.service.ArchitectureService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
 
@CrossOrigin
@RestController
public class ArchitectureController {
    @Autowired
    ArchitectureService archService;
    
       @Autowired
    private ObjectMapper objectMapper; // Spring Boot automatically injects this

    @GetMapping("/getarhitecture")
    public JsonNode getArchitecture(String appType){

        try {
            //call the method from service class
       // String jsonString = archService.getArchDetails(appType);
      //  System.out.println("jsonString " + jsonString);
      //  JsonNode jsonNode = objectMapper.readTree(jsonString);
      JsonNode jsonNode =archService.getArchDetailsJson(appType);
      
        System.out.println("jsonNode " + jsonNode.toPrettyString());
        return jsonNode;
        } catch (Exception e) {
            System.out.println("Exception -> " + e.getMessage());
            e.printStackTrace();
        } 
         return null;
    } 
}
