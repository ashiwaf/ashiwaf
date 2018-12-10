package com.example.demo;

import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.springframework.util.FileSystemUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Data
public class Page {
    private String title;
    private String body;
    private String folderPath;

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter(folderPath + this.getTitle());

        fileWriter.write(this.getBody());
        fileWriter.close();
    }

    public Map list(){ // 一個一個key:valueの形に整形してMapを作った
        File dirList = new File(this.getFolderPath());
        Map fileList = new HashMap();

        for (int i = 0; i < dirList.list().length;i++){
            fileList.put(i,dirList.list()[i]);
        }
        return fileList;
    }


    public String[] listString(){
        String[] dirList = new File(this.getFolderPath()).list();
        return dirList;
    }

    public Map get(String title){
        Map page = new HashMap();
        FileReader fileReader;
        System.out.println(folderPath);
        try {
            page.put(title, FileUtils.readFileToString(new File(folderPath + title)));
        }
        catch(IOException e) {
            System.out.println(e);
        }

        return page;
    }
}
