package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients(IngredientsType.ONION)
                .burgers(2)
                .sauce(SauceType.THOUSAND_ISLANDS)
                .ingredients(IngredientsType.CHEESE)
                .bun(BunType.STANDARD)
                .ingredients(IngredientsType.CUCUMBER)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        BunType whichBun = bigmac.getBun();
        SauceType whichSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(BunType.STANDARD, whichBun);
        Assert.assertEquals(SauceType.THOUSAND_ISLANDS, whichSauce);
    }
}