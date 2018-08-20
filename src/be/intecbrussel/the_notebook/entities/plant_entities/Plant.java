package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {

	private String name;
	private double height;

	public Plant(String name) {
		this("",0);
		this.name = name;
	}

	public Plant(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Plant [name=" + name + ", height=" + height + ", getHeight()=" + getHeight() + ", getName()="
				+ getName() + "]";
	}

}
