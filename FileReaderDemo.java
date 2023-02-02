package com.demo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/com/demo/Sampletxt");
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException fe){
            fe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}