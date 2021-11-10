package com.ismo.exabstract;

public class AnimalHerbivor extends AbstractAnimal {

	public AnimalHerbivor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalHerbivor(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		System.out.println(getNom() + " mange de l'herbe.");
	}
}
