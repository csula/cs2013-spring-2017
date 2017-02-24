package edu.calstatela.cs.jtran.lab8;

public class Animal {
	final String breed;
	final String gender;
	public Animal(final String breed, final String gender) {
		this.breed = breed;
		this.gender = gender;
	}
	
	public String toString() {
		return gender + " " + breed;
	}
}
