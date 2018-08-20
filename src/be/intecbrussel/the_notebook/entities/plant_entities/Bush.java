package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{

	private String fruit;
	private LeafType leafType;

	public Bush(String fruit) {
		super("",0);
		this.fruit = fruit;
	}

	public Bush(String fruit, LeafType leafType) {
		super("",0);
		this.fruit = fruit;
		this.leafType = leafType;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return "Bush [getFruit()=" + getFruit() + ", getLeafType()=" + getLeafType() + "]";
	}

}
