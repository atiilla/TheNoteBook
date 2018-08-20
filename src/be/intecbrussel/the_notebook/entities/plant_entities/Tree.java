package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {

	private LeafType leafType;

	public Tree(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Tree(String name, LeafType leafType) {
		super(name);
		this.leafType = leafType;
	}
	
	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return "Tree [getLeafType()=" + getLeafType() + "]";
	}

	

}
