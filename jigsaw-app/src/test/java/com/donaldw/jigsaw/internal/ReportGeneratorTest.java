package com.donaldw.jigsaw.internal;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReportGeneratorTest {

    @Test
    public void formatList() {
        ReportGenerator service = new ReportGenerator();
        Assert.assertEquals("(1234)\n(java)", service.generatorReport(List.of("1234", "java")));
    }
}
