package com.donaldw.jigsaw;

import com.donaldw.jigsaw.internal.ReportGenerator;
import com.donaldw.jigsaw.service.EventService;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Jigsaw {
    public static void main(String[] args) {
        Jigsaw jigsaw = new Jigsaw();

        jigsaw.run();
    }

    private void run() {
        List<EventService> services = getServices();

        System.out.println(services.stream()
                .map((e) -> "Discovered: [" + e.getServiceName() + "]")
                .collect(Collectors.joining("\n")));

        List<String> events = new ArrayList<>();

        services.stream()
                .map(EventService::getEvents)
                .forEach(events::addAll);

        System.out.println(new ReportGenerator().generatorReport(events));
    }

    private List<EventService> getServices() {
        List<EventService> eventServices = new ArrayList<>();

        ServiceLoader.load(EventService.class).forEach(eventServices::add);

        return eventServices;
    }
}
