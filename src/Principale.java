
public class Principale {
public static void main(String[] args) {
	
	
	PizzaBuilder build = new PizzaBuilder();
	
	
	Pizza p1= build.createNewPizza()
			.buildPate()
			.buildSauce()
			.buildContenu()
			.getPizza();
	
	
	System.out.println(p1);
}
}
