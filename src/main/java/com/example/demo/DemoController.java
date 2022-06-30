package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${test-string}")
    private String testString;

    @GetMapping("")
    public ResponseEntity<String> getAnyValue() throws Exception {
        log.info(String.format("외부에서 삽입된 변수: %s", testString));
        return new ResponseEntity<>("이 텍스트가 나오면 정상 동작하는겁니다.", HttpStatus.OK);
    }

}
