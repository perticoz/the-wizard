package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Gandalf implements WizardInterface {
	
	private Clothes theClothes;
	
	@Autowired
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
