package com.udemy.seleniumdesign.abctractFactory;

public class ModernFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTatle();
    }
}
