package com.donaldw.jigsaw.internal;

import java.util.List;
import java.util.stream.Collectors;

public class ReportGenerator {

    public String generatorReport(List<String> events) {
        return events.stream()
                .map((e) -> "(" + e + ")")
                .collect(Collectors.joining("\n"));
    }
}
