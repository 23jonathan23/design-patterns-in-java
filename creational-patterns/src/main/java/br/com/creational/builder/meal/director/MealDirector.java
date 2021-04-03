package br.com.creational.builder.meal.director;

import br.com.creational.builder.meal.builder.FastFoodMealBuilder;
import br.com.creational.builder.meal.model.FastFoodMeal;

public class MealDirector {
    private FastFoodMealBuilder _builder;

    public MealDirector(FastFoodMealBuilder builder) {
        _builder = builder;
    }

    public void constructorCombo() {
        _builder.buildDrink();
        _builder.buildMain();
        _builder.buildSide();
        _builder.buildDessert();
        _builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return _builder.getMeal();
    }
}
