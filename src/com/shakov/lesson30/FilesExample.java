package com.shakov.lesson30;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.util.List.*;

public class FilesExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "writer.txt");
        Files.write(path, of("Hello World!", "Java"));

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.append("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.append("Java");
        }

        Path path2 = Path.of("resources", "test.txt");
        try (Stream<String> lines = Files.lines(path2)) {
            lines.forEach(System.out::println);
        }
    }
}
