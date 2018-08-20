package be.intecbrussel.the_notebook.app;

import java.util.ArrayList;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Bush;
import be.intecbrussel.the_notebook.entities.plant_entities.Flower;
import be.intecbrussel.the_notebook.entities.plant_entities.LeafType;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import be.intecbrussel.the_notebook.entities.plant_entities.Tree;
import be.intecbrussel.the_notebook.entities.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp {

	public static void main(String[] args) {

		ForestNoteBook notebook = new ForestNoteBook();

		Plant plant1 = new Bush("Bush", LeafType.HAND);
		Plant plant2 = new Flower("Flower", 30);
		Plant plant3 = new Tree("Tree", LeafType.NEEDLE);
		Plant plant4 = new Weed("Weed", 30);

		ArrayList<Plant> plant = new ArrayList<>();
		plant.add(plant1);
		plant.add(plant2);
		plant.add(plant3);
		plant.add(plant4);
		for (Plant plant5 : plant) {
			System.out.println(plant5);
		}
		Animal animal1 = new Carnivore("Whales", 3600, 30, 8);
		Animal animal2 = new Herbivore("Herbivore", 3600, 30, 8);
		Animal animal3 = new Omnivore("Omnivore", 3600, 30, 8);
		Animal animal4 = new Carnivore("Lion", 190, 1.2, 1);

		ArrayList<Animal> animal = new ArrayList<>();
		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);

		for (Animal animal5 : animal) {
			System.out.println(animal5);
		}

		System.out.println("Display all");
		notebook.printNotebook();

		System.out.println("Plants: Sort by name");
		notebook.sortAnimalsByName();
		System.out.println("Animals: Sort by name");
		
		System.out.println(notebook.getAnimalCount());

	}

}
