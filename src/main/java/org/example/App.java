package org.example;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		Gson gs = new Gson();
		System.out.println(gs.toJson(new User("Vladimir","Motyka")));
	}
	
}
