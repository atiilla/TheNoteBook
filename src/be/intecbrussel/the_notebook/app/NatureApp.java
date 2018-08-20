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
		Plant plant5 = new Bush("Bush", LeafType.HAND);
		Plant plant6 = new Flower("Flower", 30);
		Plant plant7 = new Tree("Tree", LeafType.NEEDLE);
		Plant plant8 = new Weed("Weed", 30);
		Plant plant9 = new Weed("Weed", 30);

		ArrayList<Plant> plant = new ArrayList<>();
		plant.add(plant1);
		plant.add(plant2);
		plant.add(plant3);
		plant.add(plant4);
		plant.add(plant5);
		plant.add(plant6);
		plant.add(plant7);
		plant.add(plant8);
		plant.add(plant9);
		
		Animal animal1 = new Carnivore("Whales", 3600, 30, 8);
		Animal animal2 = new Herbivore("Herbivore", 3600, 30, 8);
		Animal animal3 = new Omnivore("Omnivore", 3600, 30, 8);
		Animal animal4 = new Carnivore("Lion", 190, 1.2, 1);
		Animal animal5 = new Carnivore("Leopard", 130, 1.3, 2);
		ArrayList<Animal> animal = new ArrayList<>();

		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(animal5);

		/*
		 * for (Animal animal6 : animal) { System.out.println(animal6); }
		 */

		notebook.addAnimal(animal1);
		notebook.addAnimal(animal2);
		notebook.addAnimal(animal3);
		notebook.addAnimal(animal4);
		notebook.addAnimal(animal5);
		
		notebook.addPlant(plant1);
		notebook.addPlant(plant2);
		notebook.addPlant(plant3);
		notebook.addPlant(plant4);
		notebook.addPlant(plant5);
		notebook.addPlant(plant6);
		notebook.addPlant(plant7);
		notebook.addPlant(plant8);
		notebook.addPlant(plant9);

		System.out.println("\n###############");
		System.out.println("Display all");
		System.out.println("###############");
		notebook.printNotebook();

		System.out.println("\n###############");
		System.out.println("Plants: Sort by name");
		System.out.println("###############");
		notebook.sortPlantsByName();
		
		System.out.println("\n###############");
		System.out.println("Animals: Sort by name");
		System.out.println("###############");
		notebook.sortAnimalsByName();


	}

}
