package org.studies;

import org.studies.util.ProcessCsv;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new ProcessCsv().processWithSplitAndReturnMap();
    }
}