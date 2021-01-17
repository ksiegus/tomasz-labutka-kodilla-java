package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigmacTestSuite {

    @Test
    void testBigmacBuilderNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Roll with sesame seeds")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Chili Peppers")
                .ingredient("Cucumber")
                .ingredient("Cheese")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);
        assertEquals(3, bigmac.getBurgers());
        assertEquals("Barbecue", bigmac.getSauce());
        assertEquals("Roll with sesame seeds", bigmac.getBun());

    }

    @Test
    void testBigmacBuilderCheckRequired() {
        //Given
        Bigmac bigmac1 = new Bigmac.BigmacBuilder()
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Chili Peppers")
                .ingredient("Cucumber")
                .ingredient("Cheese")
                .ingredient("Mushrooms")
                .build();

        //When
        System.out.println(bigmac1);

        //Then
        assertEquals("Bun", bigmac1.getBun());
        assertEquals(1, bigmac1.getBurgers());
    }
}