import com.donaldw.jigsaw.service.animals.AnimalsService;

module com.donaldw.jigsaw.service.animals {

    requires com.donaldw.jigsaw.service;

    exports com.donaldw.jigsaw.service.animals;

    provides com.donaldw.jigsaw.service.EventService
            with AnimalsService;

}