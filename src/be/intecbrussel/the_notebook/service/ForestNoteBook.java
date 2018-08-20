package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class ForestNoteBook {

	private List<Carnivore> carnivores = new LinkedList<Carnivore>();
	private List<Omnivore> omnivores = new LinkedList<Omnivore>();
	private List<Herbivore> herbivores = new LinkedList<Herbivore>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList();
	private List<Plant> plants = new ArrayList();
	private Animal animal;

	public ForestNoteBook() {
		super();
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		return plants.size();
	}

	public int getAnimalCount() {
		return animals.size();
	}

	public void addAnimal(Animal animal) {
		if (!checkAnimal()) {
			animals.add(animal);
			this.animalCount++;
			if (animal instanceof Carnivore) {
				carnivores.add((Carnivore) animal);
			} else if (animal instanceof Omnivore) {
				omnivores.add((Omnivore) animal);
			} else if (animal instanceof Herbivore) {
				herbivores.add((Herbivore) animal);
			} else {
				System.out.println("the animal already exist. ");
			}
		}

	}

	private boolean checkAnimal() {

		/*
		 * / for (Animal animalz : animals) { if(animalz.equals(animal)) { return true;
		 * } }
		 */
		return false;

	}

	public void addPlant(Plant plant) {
		plants.add(plant);

	}

	public void printNotebook() {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		for (Plant plant : plants) {
			System.out.println("Plants:" + plant);
		}

	}

	public void sortAnimalsByName() {
		animals.sort(new Comparator<Animal>() {

			@Override
			public int compare(Animal o1, Animal o2) {
				System.out.println(o1.getName().compareTo(o2.getName()));
				return o1.getName().compareTo(o2.getName());
			}
		});

	}

	public void sortPlantsByName() {
		plants.sort(new Comparator<Plant>() {

			@Override
			public int compare(Plant o1, Plant o2) {
				System.out.println(o1.getName().compareTo(o2.getName()));
				return o1.getName().compareTo(o2.getName());

			}
		});

	}

}
