package com.ssischaefer.ssi_shaefer.controller;

import com.ssischaefer.ssi_shaefer.repository.TransportUnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ApiController {

    @Autowired
    private TransportUnitRepo transportUnitRepo;

    @PostMapping("/notification")
    @ResponseBody
    public ResponseEntity notificationPointPassed(@RequestParam String tuName,
                                                  @RequestParam String rpName,
                                                  @RequestParam String movementType){
        try{
            return ResponseEntity.ok("Тут могла бы быть бизнес логика");

        }catch (Exception e){
            return ResponseEntity.badRequest().body("Сервер не работает");
        }
    }

    @PostMapping("/printingCompletion")
    public ResponseEntity printingCompletion(@RequestParam String tuName,
                                             @RequestParam String printerName,
                                             @RequestParam String labelTemplate){
        try{
            return ResponseEntity.ok("Тут могла бы быть бизнес логика");

        }catch (Exception e){
            return ResponseEntity.badRequest().body("Сервер не работает");
        }
    }

    @GetMapping("/getTo/{tuName}")
    public String getTo(@PathVariable String tuName) {

        return tuName;
    }

    @GetMapping("/getLabelTemplate")
    public String getLabelTemplate(@RequestParam String printerName, @RequestParam String tuName) {

        return "(...->labelTemplate)";
    }
}
