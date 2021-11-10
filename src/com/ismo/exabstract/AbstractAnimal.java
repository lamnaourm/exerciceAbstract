package com.ismo.exabstract;


public abstract class AbstractAnimal {
	
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public AbstractAnimal(String nom) {
		super();
		this.nom = nom;
	}
	
	public AbstractAnimal() {

	}

	public abstract void manger();
	
	@Override
	public String toString() {
		return String.format("Nom de l'animal : %s", nom);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		AbstractAnimal a = (AbstractAnimal)obj;
		return nom.equals(a.nom);
	}
}
