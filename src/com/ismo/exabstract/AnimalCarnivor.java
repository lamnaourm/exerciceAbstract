package com.ismo.exabstract;

public class AnimalCarnivor extends AbstractAnimal {

	
	public AnimalCarnivor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalCarnivor(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		System.out.println(getNom() + " mange la viande");
	}
}
