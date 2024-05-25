package edu.pro.analyzer;

import edu.pro.analyzer.util.FileUtil;

import java.util.*;

public class TextAnalyzer {

    public void analyzeTopFrequencies(String filePath, int topN) {
        String content = FileUtil.loadTextWithCleanup(filePath);
        if (content.isBlank()) {
            return;
        }

        Map<String, Integer> wordFrequency = calculateWordFrequency(content);
        List<Map.Entry<String, Integer>> topFrequencies = getTopFrequencies(wordFrequency, topN);
        topFrequencies.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    private static Map<String, Integer> calculateWordFrequency(String content) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = content.split("\\s+");

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        return frequency;
    }

    private static List<Map.Entry<String, Integer>> getTopFrequencies(Map<String, Integer> frequencyMap, int topN) {
        return frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(topN)
                .toList();
    }
}
