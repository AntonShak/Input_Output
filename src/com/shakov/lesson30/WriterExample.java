package com.shakov.lesson30;

import java.io.*;
import java.nio.file.Path;

public class WriterExample {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "wtiter.txt").toFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.append("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.append("Java");
        }
    }
}
