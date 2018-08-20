package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {

	private Scent scent;

	public Flower(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Flower(String name, double height) {
		super(name, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Flower [scent=" + scent + "]";
	}

}
