package org.studies.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcessaCsv {

    public void processaCsv() {

        System.out.println("Ok");

        try {
            Stream<String> stream = Files.lines(Paths.get("src/main/resources/lista-cnaes.csv"), StandardCharsets.ISO_8859_1);
            stream.forEach(System.out::println);
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
