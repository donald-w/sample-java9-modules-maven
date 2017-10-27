package com.donaldw.jigsaw.service.animals;

import org.junit.Assert;
import org.junit.Test;

public class WorkshopServiceTest {

    @Test
    public void testGetEvents() {
        AnimalsService ts = new AnimalsService();
        Assert.assertEquals(2, ts.getEvents().size());
    }

    @Test
    public void testPrefix() {
        Assert.assertEquals(AnimalsService.prefix("Shark"), "Animal: Shark");
    }

}
