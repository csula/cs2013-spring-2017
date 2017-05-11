package edu.calstatela.cs.jtran.lab08;

import java.util.ArrayList;

public class AnimalAnagram {

	public static void printArray(final ArrayList<Animal> array) {
		for (Animal a : array) {
			System.out.println(a);
		}
	}
	
	public static void printAnagrams(final ArrayList<Animal> prefix,
									 final ArrayList<Animal> rest) 
	{
		if (rest.size() <= 1) {
			// base case
			ArrayList<Animal> array = new ArrayList<Animal>(prefix);
			array.addAll(rest);
			printArray( array );
		} else {
			// induction step
			for (int i = 0; i < rest.size(); ++i) {
				final Animal cur = rest.get( i );
				ArrayList<Animal> before = new ArrayList<Animal>(rest.subList(0, i)); 
				ArrayList<Animal> after = new ArrayList<Animal>(rest.subList(i+1, rest.size()));
				
				ArrayList<Animal> newPrefix = new ArrayList<Animal>();
				newPrefix.add( cur );
				ArrayList<Animal> newRest = new ArrayList<Animal>(before);
				newRest.addAll( after );
				printAnagrams( newPrefix, newRest );
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add( new Animal ("Poodle", "male") );
		animals.add( new Animal ("Labador", "female") );
		animals.add( new Animal ("Horse", "male") );
		animals.add( new Animal ("Shih Tzu", "female") );
		printArray(animals);
		// printAnagrams( new ArrayList<Animal>(), animals );
	}

}
