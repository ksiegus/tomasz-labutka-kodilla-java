package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.name = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!name.equals(country.name)) return false;
        return peopleQuantity.equals(country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
