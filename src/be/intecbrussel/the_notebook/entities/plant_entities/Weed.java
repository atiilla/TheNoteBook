package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

	private double area;

	public Weed(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Weed(String name, double area) {
		super("",0);
		this.area = area;
	}

	@Override
	public String toString() {
		return "Weed [area=" + area + "]";
	}
	
	
	
}
