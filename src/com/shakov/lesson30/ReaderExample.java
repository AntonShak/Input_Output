package com.shakov.lesson30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderExample {

    public static void main(String[] args) throws IOException {

        File file = Path.of("resources", "test.txt").toFile();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String collect = bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }
}
