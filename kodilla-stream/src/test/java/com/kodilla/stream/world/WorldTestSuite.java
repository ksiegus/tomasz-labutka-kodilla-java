package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("37832599"));
        Country czechia = new Country("Czechia", new BigDecimal("10715674"));
        Country ukraine = new Country("Ukraine", new BigDecimal("43644446"));

        Country china = new Country("China", new BigDecimal("1439323776"));
        Country india = new Country("India", new BigDecimal("1384530463"));
        Country laos = new Country("Laos", new BigDecimal("7310568"));

        Country usa = new Country("USA", new BigDecimal("331653357"));
        Country mexico = new Country("Mexico", new BigDecimal("129384259"));
        Country canada = new Country("Canada", new BigDecimal("37852693"));


        //When
        Continent europa = new Continent("Europa");
        europa.addCountry(poland);
        europa.addCountry(czechia);
        europa.addCountry(ukraine);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(laos);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        // System.out.println(world.getPeopleQuantity());

        //Then
        BigDecimal expectedPeople = new BigDecimal("3422247835");
        assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}