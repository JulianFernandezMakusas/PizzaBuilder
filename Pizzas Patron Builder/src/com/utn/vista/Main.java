package com.utn.vista;

import com.utn.vista.Pizzas.*;

public class Main {

	public static void main(String[] args) {
		
		Pizzas muzzarella = new PizzaBuilder(Size.BIG, Name.MUZZARELLA).withSauce(Sauce.SALSA_TOMATE).withCheese(Cheese.MUZZARELLA).build();
		System.out.println(muzzarella);
		Pizzas roquefort = new PizzaBuilder(Size.BIG, Name.PIZZA_ROQUEFORT).withSauce(Sauce.SALSA_TOMATE).withCheese(Cheese.ROQUEFORT).build();
		System.out.println(roquefort);
		
	}

}
