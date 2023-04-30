package com.weatherwear.model;

//Scores outfit based on criteria
public class ScoringSystem {
	
	public void calculateOutfitScore(Outfit outfit) {
		int score = 0;
		
		score += calculateGarmentPairingScore(outfit);
		
		
		outfit.score = score;
		
	}

	//Garment pairings
	private int calculateGarmentPairingScore(Outfit outfit) {
		int score = 0;
		
		int hello;
        // Shirt and Outerwear pairings
		score += GarmentPairing.getScore(outfit.getShirt().getItem_subtype(), outfit.getOuterwear().getItem_subtype());
		
        // Shirt and Pants pairings
		score += GarmentPairing.getScore(outfit.getShirt().getItem_subtype(), outfit.getPants().getItem_subtype());
		
		//Shirt and Shoes pairings
		score += GarmentPairing.getScore(outfit.getShirt().getItem_subtype(), outfit.getShoes().getItem_subtype());

		//Pants and Shoes pairings
		score += GarmentPairing.getScore(outfit.getPants().getItem_subtype(), outfit.getShoes().getItem_subtype());

		//Pants and Outerwear pairings
		score += GarmentPairing.getScore(outfit.getPants().getItem_subtype(), outfit.getOuterwear().getItem_subtype());

		//Outerwear and Shoes pairings
		score += GarmentPairing.getScore(outfit.getOuterwear().getItem_subtype(), outfit.getShoes().getItem_subtype());

		
		return score;
	}
	

}
