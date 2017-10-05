package com.donaldw.jigsaw.animals.service;

import com.donaldw.jigsaw.service.EventService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsService implements EventService {

    static String prefix(String input) {
        return "Animal: " + input;
    }

    public List<String> getEvents() {
        return Stream.of(
                "Monkey",
                "Shark"
        )
                .map(AnimalsService::prefix)
                .collect(Collectors.toList());
    }

    public String getServiceName() {
        return "AnimalsService";
    }
}
