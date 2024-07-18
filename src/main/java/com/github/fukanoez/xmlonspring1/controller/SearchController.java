package com.github.fukanoez.xmlonspring1.controller;


import com.github.fukanoez.xmlonspring1.model.Attribute;
import com.github.fukanoez.xmlonspring1.service.UuidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    private final UuidService uuidService;

    @Autowired
    public SearchController(UuidService uuidService) {
        this.uuidService = uuidService;
    }

//    @GetMapping("/search")
//    public String search(@RequestParam String key, @RequestParam String value) {
//
//        return "Searched for key: " + key + " and value: " + value;
//    }
    @GetMapping("/search")
    public List<Attribute> search(@RequestParam String key, @RequestParam String value) {
        return uuidService.searchByKey(key,value);
    }
}
