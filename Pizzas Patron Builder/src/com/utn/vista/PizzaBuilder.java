package com.utn.vista;

import com.utn.vista.Pizzas.*;

public class PizzaBuilder {
	
	private Pizzas pizza;
	public PizzaBuilder (Size size, Name name) {
		this.pizza = new Pizzas();
		if (size == null|| name == null) {
			throw new IllegalArgumentException();
		}
		pizza.setSize(size);
		pizza.setName(name);
	}
	public PizzaBuilder withSauce (Sauce salsaTomate) {
		pizza.setSauce(salsaTomate);
		return this;
	}
	public PizzaBuilder withCheese (Cheese cheese) {
		pizza.setCheese(cheese);
		return this;
	}
	public PizzaBuilder withIngredients (Ingredients ingredients){
		pizza.setIngredients(ingredients);
		return this;
	}
	public Pizzas build() {
		return pizza;
	}
}
