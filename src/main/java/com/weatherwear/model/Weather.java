package com.weatherwear.model;

import java.sql.*;

public class Weather {

	private double chance_of_rain;
	private String condition;
	private double high;
	private double low;
	private String result;
	private String outfitString;
	
	public double getChance_of_rain() {
		return chance_of_rain;
	}
	
	public void setChance_of_rain(double chance_of_rain) {
		this.chance_of_rain = chance_of_rain;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public void setReult(String r) {
		this.result = r;
	}
	
	public void setOutfitString(String s) {
		this.outfitString = s;
	}
	
	public String getOutfitString() {
		return this.outfitString;
	}
	
	public void callDB(String query) {
//	    String url = "jdbc:postgresql://localhost:5432/wardrobe";
//	    String user = "postgres";
//	    String password = "password";
//	    try (Connection connection = DriverManager.getConnection(url, user, password)) {
//	      System.out.println("Connected to the PostgreSQL server successfully.");
//	      Statement statement = connection.createStatement();
//	      String sql = "SELECT * FROM closet";
//	      ResultSet resultSet = statement.executeQuery(sql);
//	      while (resultSet.next()) {
//	        // You can retrieve the data from the result set by column name or index
//	        String item_name = resultSet.getString("item_name");
//	        String item_type = resultSet.getString("item_type");
//	        // ...
//	        System.out.println(item_name + "  " + item_type);
//	      }
//	    } catch (SQLException e) {
//	      System.out.println("Connection failure.");
//	      e.printStackTrace();
//	    }
		       String url = "jdbc:postgresql://localhost:5432/wardrobe";
		       String username = "postgres";
		       String password = "";
		       
		       try {
		           Connection connection = DriverManager.getConnection(url, username, password);
		           Statement statement = connection.createStatement();
		           
		           ResultSet resultSet = statement.executeQuery(query);
		           
		           StringBuilder stringBuilder = new StringBuilder();
		           while (resultSet.next()) {
		               String itemName = resultSet.getString("item_name");
		               String itemType = resultSet.getString("item_type");
		               
		               stringBuilder.append(itemName).append(" ").append(itemType).append("\n");
		           }
		           
		           String fileContent = stringBuilder.toString();
		           // Write fileContent to a file or do whatever you need with it
		           
		           resultSet.close();
		           statement.close();
		           connection.close();
		           System.out.println(fileContent);
		           this.outfitString = fileContent;
		       } catch (SQLException e) {
		           System.out.println("Error connecting to database: " + e.getMessage());
		       }
		       

	}

	@Override
	public String toString() {
		return "Weather [high=" + high + ", low=" + low + "]";
	}


}