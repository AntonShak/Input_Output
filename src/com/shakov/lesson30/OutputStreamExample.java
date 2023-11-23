package com.shakov.lesson30;

import java.io.*;
import java.nio.file.Path;

public class OutputStreamExample {

    public static void main(String[] args) throws IOException {

        File file = Path.of("resources", "outText.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello World";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }

    }
}
