package com.pipeline.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LineByLineReader {

    public static List<String> readFile(String filename) throws IOException {

        List<String> lines = new ArrayList<>();

        // Open the file
        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            lines.add(strLine);
        }

        //Close the input stream
        br.close();

        return lines;
    }

}
