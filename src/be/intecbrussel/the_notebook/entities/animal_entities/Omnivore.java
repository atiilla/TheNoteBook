package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Set;
import java.util.TreeSet;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Omnivore extends Animal {

	private Set<Plant> plantDiet = new TreeSet<Plant>();
	private double maxFoodSize;
	
	public Omnivore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
		// TODO Auto-generated constructor stub
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	void addPlantToDiet(Plant plant) {
		plantDiet.add(plant);
	}

	@Override
	public String toString() {
		return "Omnivore [getPlantDiet()=" + getPlantDiet() + ", getMaxFoodSize()=" + getMaxFoodSize() + "]";
	}
	
	

}
