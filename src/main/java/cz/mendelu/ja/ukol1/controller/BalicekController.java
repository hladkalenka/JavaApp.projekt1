package cz.mendelu.ja.ukol1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BalicekController {
    //value ze springu - pro nacteni konfiguracni promenne z yaml
    @Value("${MenEx.planes.OK-AHT}")
    private String letadylko;

    @GetMapping("/letadylko")
    public ResponseEntity<String> getNazevLetadylka(){
        log.info("Letadylko: {}", letadylko);
        return new ResponseEntity<>(letadylko, HttpStatus.OK);
    }

}
