package com.example.demo;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@Data
public class DemoApplication {
    private String folderPath = "/tmp/note/";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//
//    @GetMapping("/")
//    public String getHelloworld(){
//        return "helloworld.html";
//    }
//
//    @ResponseBody
//    @GetMapping("/text")
//    public String getText(){
//        return "Text111.";
//    }

    @RequestMapping(value = "/api/page/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addPage(@RequestBody Page pager){
        try{
            pager.setFolderPath(this.getFolderPath());
            pager.save();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    @GetMapping(value = "/api/page/list",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Map listPages(){

        Page pager = new Page();
        pager.setFolderPath(this.getFolderPath());
        return pager.list();
    }


    @GetMapping(value = "/api/page/string",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Map listPagesString() {

        Page pager = new Page();
        pager.setFolderPath(this.getFolderPath());
        Map list = new HashMap();
        list.put("dir",pager.listString()); //Stringの配列をpager.listString()でもらい、jsonのkeyのValueに突っ込んでいる。
        return list;
    }

    @GetMapping(value = "/api/page/get/{title}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map getPages(@PathVariable("title") String title){
        Page pager = new Page();
        pager.setFolderPath(this.getFolderPath());
        return pager.get(title);
    }

}
