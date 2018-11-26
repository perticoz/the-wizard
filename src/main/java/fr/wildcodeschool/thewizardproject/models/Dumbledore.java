package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private Clothes theClothes;
	
	public Dumbledore (Clothes clothes) {
		theClothes = clothes;
	}

	@Override
	public String giveAdvice() {
		return "Stay strong!!!";

	}

	@Override
	public String changeDress() {
		return theClothes.ChoseOutfit();

	}

}
