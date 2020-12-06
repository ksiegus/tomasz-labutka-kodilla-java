package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predicators.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}