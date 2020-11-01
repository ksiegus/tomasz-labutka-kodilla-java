package com.kodilla.stream.world;
import com.kodilla.stream.forum2.ForumUser;
import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private Set<Continent> continents = new HashSet<>();

    public World() {
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                        .flatMap(continent -> continent.getCountries().stream())
                        .map(Country::getPeopleQuantity)
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
      }
}
