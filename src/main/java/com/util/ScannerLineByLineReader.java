package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerLineByLineReader implements LineByLineReader {

    public List<String> ParseFile(String filepath) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        File file = new File(filepath);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        return lines;
    }


}
