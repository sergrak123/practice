package com.ssischaefer.ssi_shaefer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @PostMapping("/notification")
    public  void notificationPointPassed(String tuName,String rpName,String movementType){
        //
    }
    @PostMapping("/printingCompletion")
    public  void printingCompletion(String tuName, String printerName, String labelTemplate){
        //
    }

    @GetMapping("/getTo")
    public String getTo(String tuName) {
        //
        return "(...->rpName)";
    }
    @GetMapping("/getLabelTemplate")
    public String getLabelTemplate(String printerName, String tuName) {
        //
        return "(...->labelTemplate)";
    }
}
