package com.practise;

public class Dog {

	private int health;

	Dog(){
		this.health = 100;
	}

	public void bark(){
		System.out.println("Bow Wow");
	}

	public int getHealth(){
		return health;
	}
}
