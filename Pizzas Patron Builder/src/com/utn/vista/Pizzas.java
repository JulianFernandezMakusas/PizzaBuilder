package com.utn.vista;


public class Pizzas {
	private Name name;
	private Size size;
	private Sauce sauce;
	private Cheese cheese;
	private Ingredients ingredients;
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Sauce getSauce() {
		return sauce;
	}
	public void setSauce(Sauce salsaTomate) {
		this.sauce = salsaTomate;
	}
	public Cheese getCheese() {
		return cheese;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Ingredients getIngredients() {
		return ingredients;
	}
	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pizzas [size=" + size + ", sauce=" + sauce + ", cheese=" + cheese + ", ingredients=" + ingredients
				+ "]";
	}
	

	public Pizzas(Size size, Sauce sauce, Cheese cheese, Ingredients ingredients) {
		super();
		this.size = size;
		this.sauce = sauce;
		this.cheese = cheese;
		this.ingredients = ingredients;
	}

	public Pizzas() {
	}

	public enum Name {
		MUZZARELLA, PIZZA_ROQUEFORT,PIZZA_VERDURA,PIZZA_TOMATE,PIZZA_JAMON;
		@Override
		public String toString () {
			return name().toLowerCase();
		}
	}
	public enum Size {
		SMALL, MEDIUM, BIG;
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	public enum Sauce {
		SALSA_TOMATE, SALSA_BLANCA;
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	
	public enum Cheese {
		MUZZARELLA, ROQUEFORT;
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
	public enum Ingredients {
		TOMATE, JAMON;
		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}
}
