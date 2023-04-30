package com.weatherwear.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class OutfitList {
	int outfitCount = 0;
	private ArrayList<Outfit> outfits;
	private ArrayList<Outfit> validFits;
	private ScoringSystem outfitScorer;
	
	public OutfitList() {
		outfits = new ArrayList<Outfit>();
		outfitScorer = new ScoringSystem();
		
	}
	

    public void buildList(String outerwearQuery, String shirtQuery, String pantQuery, String shoeQuery) {
    	ArrayList<Garment> outerwear = new ArrayList<Garment>();
    	ArrayList<Garment> shirts = new ArrayList<Garment>();
    	ArrayList<Garment> pants = new ArrayList<Garment>();
    	ArrayList<Garment> shoes = new ArrayList<Garment>();

    	
    	
        String url = "jdbc:postgresql://postgres-temp.cqqqmuimitus.us-east-1.rds.amazonaws.com:5432/postgres";
        String username = "postgres";
        String password = "password";
        
        try {
     	   //Establish connection
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(outerwearQuery);
            
            //Create list of all outerwear objects
            ResultSet outerwearRows = preparedStatement.executeQuery(); 
            while(outerwearRows.next()) {
            	outerwear.add(new Garment(outerwearRows));
            }
            System.out.println(outerwear.size() + " Outerwear(s)");
            //System.out.println(outerwear.get(0));
            
            //Create list of all shirt objects
            preparedStatement = connection.prepareStatement(shirtQuery);
            ResultSet shirtRows = preparedStatement.executeQuery(); 
            while(shirtRows.next()) {
            	shirts.add(new Garment(shirtRows));
            }
            System.out.println(shirts.size() + " Shirt(s)");
            //System.out.println(shirts.get(0));
            
            //Create list of all pant objects
            preparedStatement = connection.prepareStatement(pantQuery);
            ResultSet pantRows = preparedStatement.executeQuery(); 
            while(pantRows.next()) {
            	pants.add(new Garment(pantRows));
            }
            System.out.println(pants.size() + " Pants");
            
            //Create list of all shoe objects
            preparedStatement = connection.prepareStatement(shoeQuery);
            ResultSet shoeRows = preparedStatement.executeQuery(); 
            while(shoeRows.next()) {
            	shoes.add(new Garment(shoeRows));
            }
            System.out.println(shoes.size() + " Shoes");
            


            //Initial Score
            int score = 2;
            //Fill list with outfits who contain that score
            ArrayList<Outfit> outfits = generateOutfits(score, outerwear, shirts, pants, shoes);
            System.out.println(outfits.size() + " Outfits with a score above " + score);
            System.out.println(outfitCount + " Outfits total");
            
            
            //If there are too few outfits in the list, lower score and try again
            while((outfits.size() == 0 || outfits.size() < Math.ceil(outfitCount / 5.0))) {
            	System.out.println("Too few outfits. Lowering score to " + (score-1));
            	score -= 1;
            	outfits = generateOutfits(score, outerwear, shirts, pants, shoes);
            }
            
            
        //Sort the outfits by score in descending order
        Collections.shuffle(outfits);
        Collections.sort(outfits, new Comparator<Outfit>() {
        	public int compare(Outfit o1, Outfit o2) {
        		return Integer.compare(o2.score, o1.score);
        	}
        });
        
        
     
          
            

        
        System.out.println("Returning " + outfits.size() + " Outfits");
        this.validFits = outfits;

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    //Create every possible outfit combination and calculate it's score
    private ArrayList<Outfit> generateOutfits(int score, ArrayList<Garment> outerwear,ArrayList<Garment> shirts,ArrayList<Garment> pants,ArrayList<Garment> shoes) {
        // Generate all possible outfit combinations
    	outfitCount = 0;
    	ArrayList<Outfit> outfits = new ArrayList<Outfit>();
        for(Garment outerwearGarment: outerwear) {
        	for(Garment shirtGarment: shirts) {
        		for(Garment pantGarment: pants) {
        			for(Garment shoeGarment: shoes) {
        				Outfit outfit = new Outfit(outerwearGarment, shirtGarment, pantGarment, shoeGarment);
        				outfitScorer.calculateOutfitScore(outfit);
        				outfitCount += 1;
        				if(outfit.score > score) {
            				outfits.add(outfit);
        				}

        			}
        		}
        	}
        }
    	return outfits;
    }
    
    public ArrayList<Outfit> getValidFits() {
    	return this.validFits;
    }
}







