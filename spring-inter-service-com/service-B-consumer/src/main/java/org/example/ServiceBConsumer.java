package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceBConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBConsumer.class, args);

        // Call to Service A
        // Service B makes an HTTP GET request to Service A's /hello endpoint using RestTemplate.
        // RestTemplate is a Spring class for making HTTP requests.


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:5000/hello", String.class);
        System.out.println("Response from ServiceAProvider: " + response.getBody());
    }
}
