package ua.lviv.lgs.homeworkHashMap;

public class Pet {
	private String typeOfPet;
	private String nameOfPet;
	
	public Pet(String typeOfPet, String nameOfPet) {
		super();
		this.typeOfPet = typeOfPet;
		this.nameOfPet = nameOfPet;
	}

	public String getTypeOfPet() {
		return typeOfPet;
	}

	public void setTypeOfPet(String typeOfPet) {
		this.typeOfPet = typeOfPet;
	}

	public String getNameOfPet() {
		return nameOfPet;
	}

	public void setNameOfPet(String nameOfPet) {
		this.nameOfPet = nameOfPet;
	}

	@Override
	public String toString() {
		return "pets [typeOfPet= " + typeOfPet + ", nameOfPet= " + nameOfPet + "]";
	}
	
	

}
