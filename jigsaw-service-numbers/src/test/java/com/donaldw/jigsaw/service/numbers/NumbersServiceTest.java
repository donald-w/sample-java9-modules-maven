package com.donaldw.jigsaw.service.numbers;

import com.donaldw.jigsaw.service.numbers.NumbersService;
import org.junit.Assert;
import org.junit.Test;

public class NumbersServiceTest {

    @Test
    public void testGetEvents() {
        NumbersService ts = new NumbersService();
        Assert.assertEquals(2, ts.getEvents().size());
    }

    @Test
    public void testPrefix() {
        Assert.assertEquals(NumbersService.prefix("1234"), "Numbers: 1234");
    }

}
