package edu.pro.analyzer.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class FileUtil {

    private static final String FAILED_READ_ERROR = "ERROR | Filed to read file from path: %s, error: %s";

    private FileUtil() {
    };

    public static String loadTextWithCleanup(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            return content.replaceAll("[^A-Za-z ]", "").toLowerCase(Locale.ROOT);
        } catch (IOException e) {
            System.out.printf(FAILED_READ_ERROR, filePath, e);
            return "";
        }
    }
}
