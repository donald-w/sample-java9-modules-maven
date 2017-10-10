import com.donaldw.jigsaw.animals.service.AnimalsService;

module com.donaldw.jigsaw.animals.service {

    requires com.donaldw.jigsaw.service;

    exports com.donaldw.jigsaw.animals.service;

    provides com.donaldw.jigsaw.service.EventService
            with AnimalsService;

}