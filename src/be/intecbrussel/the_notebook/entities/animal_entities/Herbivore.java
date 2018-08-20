package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Set;
import java.util.TreeSet;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Herbivore extends Animal {

	private Set<Plant> plantDiet = new TreeSet<Plant>();

	public Herbivore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, length, length, length);
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	void printDiet() {
		for (Plant plant : plantDiet) {
			System.out.println(plant);
		}

	}

	@Override
	public String toString() {
		return "Herbivore [getPlantDiet()=" + getPlantDiet() + "]";
	}

}
