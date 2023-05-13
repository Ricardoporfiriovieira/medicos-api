package med.vol.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthyCheck {
    @GetMapping
    public String healthyCheck(){
        return "Olá Mundo!";
    }
}
