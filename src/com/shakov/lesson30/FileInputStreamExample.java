package com.shakov.lesson30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class FileInputStreamExample {

    public static void main(String[] args) throws IOException {
//        File file1 = new File(String.join(File.separator,"resources/test.txt"));
        File file = Path.of("resources", "test.txt").toFile();

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println(string);
        }
        System.out.println("-------------------------");
        try(FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String result = new String(bytes);
            System.out.println(result);

        }


    }
}
