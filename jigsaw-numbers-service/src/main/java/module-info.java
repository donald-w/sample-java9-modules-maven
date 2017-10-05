import com.donaldw.jigsaw.numbers.service.NumbersService;

module com.donaldw.jigsaw.numbers.service {

    requires com.donaldw.jigsaw.service;

    exports com.donaldw.jigsaw.numbers.service;

    provides com.donaldw.jigsaw.service.EventService
            with NumbersService;
}