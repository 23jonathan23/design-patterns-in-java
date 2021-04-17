package br.com.creational.builder.fluent.builder;

import br.com.creational.builder.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
    //Mandatory
    private String _side;
    
    //Optinals
    private String _drink;
    private String _main;
    private String _dessert;
    private String _gift;

    public FastFoodMealBuilder(String side) {
        _side = side;
    }

    public FastFoodMealBuilder forDrink(String drink) {
        _drink = drink;
        return this;
    }
    
    public FastFoodMealBuilder andMain(String main) {
        _main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(String dessert) {
        _dessert = dessert;
        return this;
    }
    
    public FastFoodMealBuilder andGift(String gift) {
        _gift = gift;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(_drink, _main, _side, _dessert, _gift);
    }
}

