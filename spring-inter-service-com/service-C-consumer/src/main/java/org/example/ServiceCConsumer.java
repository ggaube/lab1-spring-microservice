package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceCConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCConsumer.class, args);
    }

    @GetMapping("/getservicea")
    public String greet() {
        // Make a call to Service A
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:5000/hello", String.class);
        return "Service C received greeting from Service ServiceAProvider: " + response.getBody();
    }
}

