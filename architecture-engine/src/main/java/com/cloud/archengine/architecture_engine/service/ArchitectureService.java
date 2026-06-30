package com.cloud.archengine.architecture_engine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.archengine.architecture_engine.model.ArchitectureModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

 

@Service
public class ArchitectureService {

  
    public String getArchDetails(String appType){
        String jsonString =null;

         if(appType.equalsIgnoreCase("HighAvailability")){

                return  jsonString = "{\"name\":\"AWS HighAvailability Architecture\",\"services\":\"Application Load Balancer,Auto Scaling Group,EC2,Multi-AZ Deployment\"}";
        }
        else if(appType.equalsIgnoreCase("Serverless")){ 
               return  jsonString = "{\"name\":\"AWS Serverless Architecture\",\"services\":\"API Gateway,Lambda,DynamoDB\"}";
          }          

        else if(appType.equalsIgnoreCase("Microservice")){
                 return  jsonString = "{\"name\":\"AWS Microservice Architecture\",\"services\":\"SQS,Lambda,EC2, Database\"}";
        }
        else if(appType.equalsIgnoreCase("StaticWebHosting")){
                 return  jsonString = "{\"name\":\"AWS Static Web Hosting Architecture\",\"services\":\"S3(Webpages - Required : index & error),Cloudfront,Route 53\"}";
        }
        else if(appType.equalsIgnoreCase("EventDriven")){
                return  jsonString = "{\"name\":\"AWS EventDriven Architecture\",\"services\":\"S3,Lambda,Event-Bridge\"}";
        }

        return "jsonString";
    }

    public JsonNode getArchDetailsJson(String appType){
         // 1. Initialize the ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 2. Create the root ObjectNode
        ObjectNode rootNode = mapper.createObjectNode();
        JsonNode finalJsonNode;
         if(appType.equalsIgnoreCase("EventDriven")){
            
                rootNode.put("name", "AWS EventDriven Architecture");
                // 3. Create and populate the ArrayNode for services
                ArrayNode servicesArray = mapper.createArrayNode();
                servicesArray.add("S3");
                servicesArray.add("Lambda");
                servicesArray.add("Event-Bridge");

                // 4. Attach the array to the root node
                rootNode.set("services", servicesArray);
        }
         else if(appType.equalsIgnoreCase("Serverless")){ 
                rootNode.put("name", "AWS Serverless Architecture");
            
                ArrayNode servicesArray = mapper.createArrayNode();
                servicesArray.add("API Gateway");
                servicesArray.add("Lambda");
                servicesArray.add("DynamoDB");
                rootNode.set("services", servicesArray);
        }          
         else if(appType.equalsIgnoreCase("Microservice")){
                rootNode.put("name", "AWS Microservice Architecture");
                ArrayNode servicesArray = mapper.createArrayNode();
                servicesArray.add("SQS");
                servicesArray.add("Lambda");
                servicesArray.add("EC2");
                servicesArray.add("Database");
                rootNode.set("services", servicesArray);
        }
        else if(appType.equalsIgnoreCase("StaticWebHosting")){
                rootNode.put("name", "AWS Static Web Hosting Architecture");
                ArrayNode servicesArray = mapper.createArrayNode();
                servicesArray.add("S3(Webpages - Required : index & error)");
                servicesArray.add("Cloudfront");
                servicesArray.add("Route 53");
                rootNode.set("services", servicesArray); 
        }
        else if(appType.equalsIgnoreCase("HighAvailability")){
                rootNode.put("name", "AWS High Availability Architecture");
                ArrayNode servicesArray = mapper.createArrayNode();
                servicesArray.add("Application Load Balancer");
                servicesArray.add("Auto Scaling Group");
                servicesArray.add("EC2");
                servicesArray.add("Multi-AZ Deployment");
                rootNode.set("services", servicesArray); 
        }
        // 5. Cast or use as a generic JsonNode
        finalJsonNode = rootNode;
        return finalJsonNode  ;
       
    }
}
