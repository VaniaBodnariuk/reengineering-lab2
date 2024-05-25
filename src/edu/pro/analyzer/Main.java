package edu.pro.analyzer;

import edu.pro.analyzer.util.OperationDurationUtil;

public class Main {

	private static final String FILE_PATH = "src/edu/pro/txt/harry.txt";
	private static final int TOP_N = 30;

	public static void main(String[] args) {
		OperationDurationUtil.calculateFor(
				() -> new TextAnalyzer().analyzeTopFrequencies(FILE_PATH, TOP_N));
	}
}
