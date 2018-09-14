package com.util;

import java.io.FileNotFoundException;
import java.util.List;

public interface LineByLineReader {

    List<String> ParseFile(String absoluteFilePath) throws FileNotFoundException;

}
