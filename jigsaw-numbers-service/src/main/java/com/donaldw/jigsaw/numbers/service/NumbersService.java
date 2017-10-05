package com.donaldw.jigsaw.numbers.service;

import com.donaldw.jigsaw.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersService implements EventService {

    static String prefix(String input) {
        return "Numbers: " + input;
    }

    public List<String> getEvents() {
        return Stream.of(
                "1234",
                "4567"
        )
                .map(NumbersService::prefix)
                .collect(Collectors.toList());
    }

    public String getServiceName() {
        return "NumbersService";
    }
}
