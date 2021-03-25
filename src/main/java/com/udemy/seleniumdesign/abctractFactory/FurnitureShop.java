package com.udemy.seleniumdesign.abctractFactory;

public class FurnitureShop {
    public static void main(String[] args) {
        FurnitureFactory factory;
        factory = new ModernFactory();
        factory.createChair();

        factory = new VintageFactory();
        factory.createCoffeeTable();
    }
}
