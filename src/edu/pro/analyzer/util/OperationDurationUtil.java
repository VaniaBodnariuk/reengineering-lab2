package edu.pro.analyzer.util;

import java.time.Duration;
import java.time.Instant;

public class OperationDurationUtil {

    private OperationDurationUtil() {
    }

    public static void calculateFor(Runnable operation) {
        Instant start = Instant.now();
        operation.run();
        Instant finish = Instant.now();
        System.out.println("------");
        System.out.println(Duration.between(start, finish).toMillis() + " ms");
    }
}
