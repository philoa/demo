package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen
 * @version 1.0
 * @date 4/14/23 2:17 PM
 */
@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.put("msg","Hello World, ");
        return "index";
    }

    @PostMapping("/processData")
    public ResponseEntity<String> processData(@RequestBody String data) {
        try {
            // 在这里处理传入的数据
            String result = "Data processed successfully!";
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
