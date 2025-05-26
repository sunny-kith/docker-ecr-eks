package com.skith.dockerecreks.controller;

import com.skith.dockerecreks.service.DummyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    private final DummyService dummyService;

    public DummyController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String hello = dummyService.hello();
        return ResponseEntity.ok().body(hello);
    }
}
