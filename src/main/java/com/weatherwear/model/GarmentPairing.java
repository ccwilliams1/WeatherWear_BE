package com.weatherwear.model;

import java.util.HashMap;
import java.util.Map;

public class GarmentPairing {
    private static final Map<String, Integer> GARMENT_PAIRING_SCORES = new HashMap<>();
    static {
    	
        // Shirt and Outerwear pairings
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Cardigan", 1);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Blazer", 2);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Overcoat", 2);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Trench coat", 2);
        GARMENT_PAIRING_SCORES.put("Hoodie-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Hoodie-Windbreaker", 1);
        GARMENT_PAIRING_SCORES.put("Long-sleeve-Cardigan", 1);
        GARMENT_PAIRING_SCORES.put("Long-sleeve-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Long-sleeve-Bomber jacket", 1);
        GARMENT_PAIRING_SCORES.put("Polo shirt-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Polo shirt-Cardigan", 1);
        GARMENT_PAIRING_SCORES.put("Sweater-Overcoat", 1);
        GARMENT_PAIRING_SCORES.put("Sweater-Trench coat", 1);
        GARMENT_PAIRING_SCORES.put("Sweatshirt-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Tank top-Windbreaker", 1);
        GARMENT_PAIRING_SCORES.put("T-shirt-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("T-shirt-Windbreaker", 1);
    	
        // Shirt and Pants pairings
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Chinos", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Jeans", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Dress pants", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Khakis", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Slacks", 1);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Dress pants", 2);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Slacks", 2);
        GARMENT_PAIRING_SCORES.put("Hoodie-Joggers", 1);
        GARMENT_PAIRING_SCORES.put("Hoodie-Sweatpants", 1);
        GARMENT_PAIRING_SCORES.put("Long-sleeve-Jeans", 1);
        GARMENT_PAIRING_SCORES.put("Polo shirt-Chinos", 1);
        GARMENT_PAIRING_SCORES.put("Polo shirt-Khakis", 1);
        GARMENT_PAIRING_SCORES.put("Sweater-Dress pants", 1);
        GARMENT_PAIRING_SCORES.put("Sweater-Slacks", 1);
        GARMENT_PAIRING_SCORES.put("Sweatshirt-Jeans", 1);
        GARMENT_PAIRING_SCORES.put("Tank top-Shorts", 1);
        GARMENT_PAIRING_SCORES.put("T-shirt-Jeans", 1);
        GARMENT_PAIRING_SCORES.put("T-shirt-Shorts", 1);
        
        // Shirt and Shoes pairings
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Dress shoes", 1);
        GARMENT_PAIRING_SCORES.put("Button-down shirt-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Dress shirt-Dress shoes", 2);
        GARMENT_PAIRING_SCORES.put("Hoodie-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Long-sleeve-Stylish Boots", 1);
        GARMENT_PAIRING_SCORES.put("Polo shirt-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Sweater-Dress shoes", 1);
        GARMENT_PAIRING_SCORES.put("Sweatshirt-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Tank top-Sandals", 1);
        GARMENT_PAIRING_SCORES.put("T-shirt-Sneakers", 1);
        
        // Pants and Shoes pairings
        GARMENT_PAIRING_SCORES.put("Cargo pants-Stylish Boots", 1);
        GARMENT_PAIRING_SCORES.put("Chinos-Dress shoes", 1);
        GARMENT_PAIRING_SCORES.put("Chinos-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Dress pants-Dress shoes", 2);
        GARMENT_PAIRING_SCORES.put("Jeans-Stylish Boots", 1);
        GARMENT_PAIRING_SCORES.put("Jeans-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Joggers-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Khakis-Dress shoes", 1);
        GARMENT_PAIRING_SCORES.put("Khakis-Sneakers", 1);
        GARMENT_PAIRING_SCORES.put("Shorts-Sandals", 1);
        GARMENT_PAIRING_SCORES.put("Slacks-Dress shoes", 1);
        GARMENT_PAIRING_SCORES.put("Sweatpants-Slippers", 1);
        GARMENT_PAIRING_SCORES.put("Sweatpants-Sneakers", 1);
        
        
        // Pants and Outerwear pairings
        GARMENT_PAIRING_SCORES.put("Chinos-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Chinos-Cardigan", 1);
        GARMENT_PAIRING_SCORES.put("Dress pants-Blazer", 2);
        GARMENT_PAIRING_SCORES.put("Dress pants-Overcoat", 2);
        GARMENT_PAIRING_SCORES.put("Dress pants-Trench coat", 2);
        GARMENT_PAIRING_SCORES.put("Jeans-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Jeans-Leather jacket", 1);
        GARMENT_PAIRING_SCORES.put("Jeans-Bomber jacket", 1);
        GARMENT_PAIRING_SCORES.put("Joggers-Windbreaker", 1);
        GARMENT_PAIRING_SCORES.put("Khakis-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Khakis-Cardigan", 1);
        GARMENT_PAIRING_SCORES.put("Slacks-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Slacks-Overcoat", 1);
        GARMENT_PAIRING_SCORES.put("Slacks-Trench coat", 1);
        GARMENT_PAIRING_SCORES.put("Sweatpants-Windbreaker", 1);
        
        // Shoes and Outerwear pairings
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Leather jacket", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Bomber jacket", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Overcoat", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Parka", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Pea coat", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Puffer jacket", 1);
        GARMENT_PAIRING_SCORES.put("Stylish Boots-Trench coat", 1);
        GARMENT_PAIRING_SCORES.put("Winter Boots-Parka", 1);
        GARMENT_PAIRING_SCORES.put("Winter Boots-Pea coat", 1);
        GARMENT_PAIRING_SCORES.put("Winter Boots-Puffer jacket", 1);
        GARMENT_PAIRING_SCORES.put("Winter Boots-Trench coat", 1);
        GARMENT_PAIRING_SCORES.put("Dress shoes-Blazer", 1);
        GARMENT_PAIRING_SCORES.put("Dress shoes-Overcoat", 1);
        GARMENT_PAIRING_SCORES.put("Dress shoes-Trench coat", 1);
        GARMENT_PAIRING_SCORES.put("Sandals-Windbreaker", 1);
        GARMENT_PAIRING_SCORES.put("Slippers-Windbreaker", 1);
        GARMENT_PAIRING_SCORES.put("Sneakers-Denim jacket", 1);
        GARMENT_PAIRING_SCORES.put("Sneakers-Windbreaker", 1);
    }
    
    public static int getScore(String type1, String type2) {
        String pair = type1 + "-" + type2;
        return GARMENT_PAIRING_SCORES.getOrDefault(pair, 0);
    }


}
