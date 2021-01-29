package com.exercice.batch.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        Path input = Paths.get("input");

        if(Files.exists(input)){
            Stream<Path> list = Files.list(input);
            list.forEach(System.out::println);
        }
    }
}
