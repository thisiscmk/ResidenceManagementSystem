package com.systemsmart.factory;
/*Author: @Phumelela Hoho
* <212195131@mycput.ac.za>
Description: Domain class description
* Date: 05/07/2020*/

import com.systemsmart.entity.Campus;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CampusFactoryTest {

    @Test
    public void createCampus() {
        Campus campus = CampusFactory.createCampus(216178606, "CPUT District Six Campus");
        Assert.assertEquals(216178606, campus.getCampusId());
        Assert.assertEquals("CPUT District Six Campus", campus.getName());
    }
}