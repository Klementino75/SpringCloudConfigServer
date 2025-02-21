package ru.netology.SpringCloudConfigServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @RequestMapping("/")
    String home() {
        System.out.println("Hello! " + "The Server has started. " + "Login Ok.");
        return "Hello! " + "The Server has started. " + "Login Ok.";
    }
}