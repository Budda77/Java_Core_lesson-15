package ua.lviv.lgs.homeworkHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;


public class ZooClub {
	
	Map<Person,List<Pet>>map;
	
	public ZooClub() {
		super();
		this.map = new HashMap<>();
	}
	
	public List<Pet> addPets() {

		List<Pet> pets = new ArrayList<>();
		
		int numberOfPets = 1+(int)(Math.random()*4);

		for(int i = 0; i < numberOfPets; i++) {
		
			pets.add(new Pet(getRandomType(getRandom(7)), getRandomName(getRandom(17))));
		}
		return pets;
	}
	
	public void addMember() {
		System.out.println("Enter the member`s name:");
		Scanner sc = new Scanner(System.in);
		String person = sc.nextLine();			
			map.put(new Person(person, getRandom(65)), new ArrayList<Pet>());

	}	
	
	public void fillClub() {		
		map.put(new Person(getRandomPerson(getRandom(21)),getRandom(65)), addPets());
	}
	
	public void addPet() {
		System.out.println("Enter the member`s name you want to add pet:");
		Scanner sc = new Scanner(System.in);
		String person = sc.nextLine();
		System.out.println("Enter the age:");
		int number = sc.nextInt();
		
		Iterator<Entry<Person,List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person,List<Pet>> next = iterator.next();
			if(next.getKey().equals(new Person(person, number))) {				
				next.setValue(addPets());
			}
		}
	}
	
	public void removeMemberPet() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pet to remove:");
		String typeOfPet = sc.nextLine();
		
		System.out.println("Enter the member`s name:");	
		String person = sc.nextLine();
		
		System.out.println("Enter the age:");
		int number = sc.nextInt();

		Iterator<Entry<Person,List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person,List<Pet>> next = iterator.next();
			if(next.getKey().equals(new Person(person, number))) {					

				List<Pet> petMember = next.getValue();
				Iterator<Pet> iterator2 = petMember.iterator();
				while(iterator2.hasNext()) {
					Pet next2 = iterator2.next();
					if(next2.getTypeOfPet().equalsIgnoreCase(typeOfPet)) {
						iterator2.remove();
					}	
				}
			}
		}
	}
	
	public void removeMember() {
		System.out.println("Enter the member`s name to remove:");
		Scanner sc = new Scanner(System.in);
		String person = sc.nextLine();
		System.out.println("Enter the age:");
		int number = sc.nextInt();

		Iterator<Entry<Person,List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person,List<Pet>> next = iterator.next();
			if(next.getKey().equals(new Person(person, number))) {								
				iterator.remove();
			}
		}
	}
	
	public void removePet() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pet to remove:");
		String typeOfPet = sc.nextLine();
		
		Iterator<Entry<Person,List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person,List<Pet>> next = iterator.next();
			
			List<Pet> petMember = next.getValue();
			Iterator<Pet> iterator2 = petMember.iterator();
			
			while(iterator2.hasNext()) {
				Pet next2 = iterator2.next();
				if(next2.getTypeOfPet().equalsIgnoreCase(typeOfPet)) {
					iterator2.remove();
				}	
			}
		}	
	}
	
	public void showClub() {
		for (Person person : map.keySet()) {
			System.out.println("member: " + person + " has:");
			
			for(Pet pet: map.get(person)) {
				System.out.println("           "+pet);
			}
		}
	}
	
	public void showClub2() {
		for(Map.Entry<Person, List<Pet>> entry: map.entrySet()) {
			Person key = entry.getKey();
			List<Pet> values = entry.getValue();
			System.out.println("Name= " + key);
			System.out.println("pets= " + values);

		}
	}
	
	public int getRandom(int id) {
		Random r = new Random();
		return r.nextInt(id);
	}
	public String getRandomType(int id) {
		String [] pets = {"cat", "dog", "hors", "parrot", "hamster", "rat", "snake", "spider"};
		String pet = pets[id];
		return  pet;
	}
	
	public String getRandomName(int id) {
		String [] names = {"Romeo", "Poppy", "Chance", "Pokey", "Coin", "Dash", "Lilo", "Windsor",
				"Missy", "Barney", "Dingo", "Comic", "Roland", "Spy", "Zeta", "Salsa", "Guinness", "Nino"};
		String name = names[id];
		return  name;
	}
	
	public String getRandomPerson(int id) {
		String [] pets = {"Lola", "Nick", "Maks", "Olga", "Alex", "Ivan", "Roma", "Lucas", "Mia", "Oliver", "Emma",
				"David", "Mary", "Linda", "Mark", "Susan", "Daniel", "Barbara", "Paul", "Sandra", "Jacob", "Donna"};
		String pet = pets[id];
		return  pet;
	}	

}
