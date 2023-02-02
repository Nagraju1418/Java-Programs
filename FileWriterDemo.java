package com.demo;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/com/demo/Sampletxt1.txt");
            fw.write("this is writing smth into a file");
            fw.close();

        } catch(Exception e){
            e.getMessage();
        }
        System.out.println("success...");
    }
}