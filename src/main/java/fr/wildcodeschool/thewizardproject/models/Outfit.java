package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements Clothes {

	@Override
	public String ChoseOutfit() {
		
		return "The wizard's dress is blue";
	}

}
