package com.weatherwear.model;

import java.sql.*;

//Weather object
public class Weather {

	private double chance_of_rain;
	private double chance_of_snow;
	private String condition;
	private double high;
	private double humidity;
	private double low;
	private String style;
	private String userEmail;
	private double uv_index;
	private double wind_speed;
	private double average;
	private String result;
	private String outfitString;
	
	private int outerwear = 1;
	
	
	
	
	
	public int getOuterwear() {
		return outerwear;
	}

	public void setOuterwear(int outerwear) {
		this.outerwear = outerwear;
	}

	public double getChance_of_rain() {
		return chance_of_rain;
	}

	public void setChance_of_rain(double chance_of_rain) {
		this.chance_of_rain = chance_of_rain;
	}

	public double getChance_of_snow() {
		return chance_of_snow;
	}

	public void setChance_of_snow(double chance_of_snow) {
		this.chance_of_snow = chance_of_snow;
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

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public double getUv_index() {
		return uv_index;
	}

	public void setUv_index(double uv_index) {
		this.uv_index = uv_index;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}	

	
	public void setOutfitString(String s) {
		this.outfitString = s;
	}
	
	public String getOutfitString() {
		return this.outfitString;
	}
	
	
	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void callDB(String query) {
		//Create connection parameters
       String url = "jdbc:postgresql://postgres-temp.cqqqmuimitus.us-east-1.rds.amazonaws.com:5432/postgres";
       String username = "postgres";
       String password = "password";
       
       try {
    	   //Establish connection
           Connection connection = DriverManager.getConnection(url, username, password);
           Statement statement = connection.createStatement();
           
           //Run SQL query 
           ResultSet resultSet = statement.executeQuery(query);
           System.out.println(resultSet);
           
           //Parse results into a string
           StringBuilder resultString = new StringBuilder();
           int rowCount = 0;
           while (resultSet.next()) {
        	   rowCount+=1;
        	   
        	   String wardrobeid = resultSet.getString("wardrobeid");
//               String item_name = resultSet.getString("item_name");
//               String item_type = resultSet.getString("item_type");
//               String item_subtype = resultSet.getString("item_subtype");
//               String item_description = resultSet.getString("item_description");
//               String item_size = resultSet.getString("item_size");
//               String item_color = resultSet.getString("item_color");
//               String item_material = resultSet.getString("item_material");
//               String dress_style = resultSet.getString("dress_style");
//               String user_email = resultSet.getString("user_email");
//               
        	   	resultString.append(wardrobeid + ",");
//               resultString.append(String.format("Item Name: %s, Item Type: %s, Item Subtype: %s, Item Description: %s, Item Size: %s, Item Color: %s, Item Material: %s, Dress Style: %s, User Email: %s%n",
//                       item_name, item_type, item_subtype, item_description, item_size, item_color, item_material, dress_style, user_email));
           }
           
//           System.out.println(resultString.toString());
//           System.out.println(rowCount);
           
           //Close connections
           resultSet.close();
           statement.close();
           connection.close();
           
           //Set the query results to the outfitString property
           this.outfitString = this.outerwear + "," + resultString.toString();
           System.out.println(this.outfitString);
       } catch (SQLException e) {
           System.out.println("Error connecting to database: " + e.getMessage());
       }
		       

	}

	@Override
	public String toString() {
		return "Weather [chance_of_rain=" + chance_of_rain + ", chance_of_snow=" + chance_of_snow + ", condition="
				+ condition + ", high=" + high + ", humidity=" + humidity + ", low=" + low + ", selected_style="
				+ style + ", user_email=" + userEmail + ", uv_index=" + uv_index + ", wind_speed="
				+ wind_speed + ", result=" + result + ", outfitString=" + outfitString + "]";
	}


}