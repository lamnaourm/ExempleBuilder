
public class PizzaBuilder {
	
	private Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}
	
	public PizzaBuilder createNewPizza() {
		pizza = new Pizza();
		return this;
	}
	
	public PizzaBuilder buildPate() {
		pizza.setPate("Pate ....");
		return this;
	}
	
	public PizzaBuilder buildSauce() {
		pizza.setSauce("Sauce ....");
		return this;
	}
	
	public PizzaBuilder buildContenu() {
		pizza.setContenu("Contenu ....");
		return this;
	}
	

}
