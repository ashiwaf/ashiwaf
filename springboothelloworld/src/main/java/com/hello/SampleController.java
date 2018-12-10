package com.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
public class SampleController {



    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class,args);
    }

    @RequestMapping("/hello")
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/bye")
    String sleep(){
        return "Good night.";
    }

    @RequestMapping("/api/string")
    String echoString(@RequestParam(name = "val") String apival){
        return apival;
    }



    @RequestMapping(value = "/api/json",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Integer> calculatorForJson(@RequestBody Map<String,Integer> arg){

            Calculator calculator = new Calculator();
            Map<String,Integer> result = calculator.Add(arg);
            return result;
            }

    @RequestMapping(value = "/api/json-to-xml",
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_XML_VALUE)
    public CalculatorDtoJsonToXml CalcJsonToXml(@RequestBody CalculatorDtoJsonToXml calculator) {
        calculator.setResult(calculator.getVal1() + calculator.getVal2());
        return calculator;
    }
}
