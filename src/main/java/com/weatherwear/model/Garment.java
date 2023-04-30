package com.weatherwear.model;

import java.sql.ResultSet;
import java.sql.SQLException;

//Creates a Garment object with information pulled from the database
public class Garment {
	int wardrobeid;
	String item_name;
	String item_type;
	String item_subtype;
	String item_description;
	String item_size;
	String item_color;
	String item_material;

	public Garment(int wardrobeid, String item_name, String item_type, String item_subtype, String item_description,
			String item_size, String item_color, String item_material) {
		this.wardrobeid = wardrobeid;
		this.item_name = item_name;
		this.item_type = item_type;
		this.item_subtype = item_subtype;
		this.item_description = item_description;
		this.item_size = item_size;
		this.item_color = item_color;
		this.item_material = item_material;
	}
	
	public Garment(ResultSet resultSet) {
		try {
			this.wardrobeid = Integer.parseInt(resultSet.getString("wardrobeid"));
			this.item_name = resultSet.getString("item_name");
			this.item_type = resultSet.getString("item_type");
			this.item_subtype = resultSet.getString("item_subtype");
			this.item_description = resultSet.getString("item_description");
			this.item_size = resultSet.getString("item_size");
			this.item_color = resultSet.getString("item_color");
			this.item_material = resultSet.getString("item_material");

        } 
		catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public int getWardrobeid() {
		return wardrobeid;
	}

	public void setWardrobeid(int wardrobeid) {
		this.wardrobeid = wardrobeid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public String getItem_subtype() {
		return item_subtype;
	}

	public void setItem_subtype(String item_subtype) {
		this.item_subtype = item_subtype;
	}
	

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getItem_color() {
		return item_color;
	}

	public void setItem_color(String item_color) {
		this.item_color = item_color;
	}

	@Override
	public String toString() {
		return "Garment [wardrobeid=" + wardrobeid + ", item_name=" + item_name + ", item_type=" + item_type
				+ ", item_subtype=" + item_subtype + "]";
	}
	
	
	
	

}
