import com.donaldw.jigsaw.service.numbers.NumbersService;

module com.donaldw.jigsaw.service.numbers {

    requires com.donaldw.jigsaw.service;

    exports com.donaldw.jigsaw.service.numbers;

    provides com.donaldw.jigsaw.service.EventService
            with NumbersService;
}