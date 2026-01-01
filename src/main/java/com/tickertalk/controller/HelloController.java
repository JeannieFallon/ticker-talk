package com.tickertalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/health")
    public Map<String, String> healthCheck() {
        return Collections.singletonMap("status", "up");
    }
}
