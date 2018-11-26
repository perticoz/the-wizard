package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private Clothes theClothes;
	
	public Gandalf(Clothes clothes) {
		theClothes = clothes;
	}

	@Override
	public String giveAdvice() {
		return "be wise!!!";
	}

	@Override
	public String changeDress() {
		return theClothes.ChoseOutfit();
	}

}
