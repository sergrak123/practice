package com.ssischaefer.ssi_shaefer.controller;

import com.ssischaefer.ssi_shaefer.entity.TransportUnitEntity;
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
            //Просто проверка добавления в бд
//            TransportUnitEntity tu = new TransportUnitEntity(
//                    2L,
//                    "Test unit2",
//                    123L);
//            transportUnitRepo.save(tu);
            // Проверка работоспособности передачи аргументов через тело запроса
            return ResponseEntity.ok("Сервер работает\n" + tuName + rpName + movementType);

        }catch (Exception e){
            return ResponseEntity.badRequest().body("Сервер не работает");
        }

    }
    @PostMapping("/printingCompletion")
    public ResponseEntity printingCompletion(String tuName, String printerName, String labelTemplate){
        String str = "";
        return ResponseEntity.badRequest().body("Сервер не работает");
    }

    @GetMapping("/getTo")
    public String getTo(@RequestParam String tuName) {
        //сам вытаскивает параметры из url через RequestParam
        //реализация
        return tuName + ": testing parameter request";
    }
    @GetMapping("/getLabelTemplate")
    public String getLabelTemplate(String printerName, String tuName) {
        //
        return "(...->labelTemplate)";
    }
}
