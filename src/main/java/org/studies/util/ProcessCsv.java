package org.studies.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ProcessCsv {

    public void processaCsv() {

        System.out.println("Ok");
        String path = "src/main/resources/lista-cnaes.csv";
        String filterParm = "arroz";

        try {
            Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.ISO_8859_1);
            List<String> opt = stream.filter(x -> x.matches("(?i).*" + filterParm + ".*")).toList();

            for (String s : opt.stream().toList()) {
                System.out.println(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, String> processWithSplitAndReturnMap() throws IOException {

        String path = "src/main/resources/lista-cnaes.csv";
        String filterParm = "arroz";
        String delimiterParm = ";";
        HashMap<String, String> map;


        Stream<String> stream = Files.lines(Paths.get(path), StandardCharsets.ISO_8859_1);
        List<String> stringList = stream.filter(x -> x.matches("(?i).*" + filterParm + ".*")).toList();

        map = new HashMap<>();

        for (String s : stringList) {
            String[] tempString = s.split(delimiterParm);
            map.put(tempString[0], tempString[1]);
        }

        return map;
    }
}
