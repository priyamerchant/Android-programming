package com.aus.objectinintent.components;

import java.io.Serializable;

public class User implements Serializable {

	private int id;
	private String name;
	
	public User() {
		id = 100;
		name = "ABCD";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
