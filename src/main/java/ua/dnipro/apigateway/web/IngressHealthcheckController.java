package ua.dnipro.apigateway.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngressHealthcheckController {

    @GetMapping
    public ResponseEntity<String> ok() {
        return ResponseEntity.ok("OK");
    }

}
