package com.next_ivis.rentMall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {
    @PostMapping("/store")
    public String storeImage() {

        return "";
    }
    @GetMapping("/pickup")
    public String getImage() {
        return "";
    }
}
