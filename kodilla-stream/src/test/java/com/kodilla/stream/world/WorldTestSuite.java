package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent southAmerica = new Continent("South America");

        Country poland = new Country("Poland", new BigDecimal("38426000"));
        Country germany = new Country("Germany", new BigDecimal("81459000"));
        Country england = new Country("England", new BigDecimal("55984000"));
        Country japan = new Country("Japan", new BigDecimal("126824000"));
        Country china = new Country("China", new BigDecimal("1386286000"));
        Country thailand = new Country("Thailand", new BigDecimal("69428000"));
        Country brazil = new Country("Brazil", new BigDecimal("209108000"));
        Country colombia = new Country("Colombia", new BigDecimal("48258000"));
        Country uruguay = new Country("Uruguay", new BigDecimal("3457000"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(england);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(thailand);

        southAmerica.addCountry(brazil);
        southAmerica.addCountry(colombia);
        southAmerica.addCountry(uruguay);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("2019230000");
        Assert.assertEquals(totalPeopleExpected, totalPeopleQuantity);
    }
}