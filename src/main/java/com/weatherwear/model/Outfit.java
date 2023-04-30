package com.weatherwear.model;

public class Outfit {
	Garment outerwear;
    Garment shirt;
    Garment pants;
    Garment shoes;
    int score;

    //Creates an Outfit object comprised of four Garment objects
	public Outfit(Garment outerwear, Garment shirt, Garment pants, Garment shoes) {
		this.outerwear = outerwear;
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;
		this.score = 0;
	}

	public Garment getOuterwear() {
		return outerwear;
	}

	public void setOuterwear(Garment outerwear) {
		this.outerwear = outerwear;
	}

	public Garment getShirt() {
		return shirt;
	}

	public void setShirt(Garment shirt) {
		this.shirt = shirt;
	}

	public Garment getPants() {
		return pants;
	}

	public void setPants(Garment pants) {
		this.pants = pants;
	}

	public Garment getShoes() {
		return shoes;
	}

	public void setShoes(Garment shoes) {
		this.shoes = shoes;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Outfit [outerwear=" + outerwear + ", shirt=" + shirt + ", pants=" + pants + ", shoes=" + shoes
				+ ", score=" + score + "]";
	}
	
	public String toStringIDs() {
		return outerwear.getWardrobeid() + "," + shirt.getWardrobeid() + "," + pants.getWardrobeid() + "," + shoes.getWardrobeid();
	}

}
