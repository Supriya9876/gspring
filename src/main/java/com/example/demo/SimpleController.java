package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

        @RequestMapping("/simple")
        public String simple() {
                return "Hello World";
        }

}
