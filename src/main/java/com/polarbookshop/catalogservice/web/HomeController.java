package com.polarbookshop.catalogservice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.polarbookshop.catalogservice.config.PolarProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    private final PolarProperties polarProperties;

    public HomeController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        log.info("Greetings");
        return polarProperties.getGreeting();
    }

}
