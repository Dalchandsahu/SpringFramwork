package com.Collection.mavelProject;

import java.util.List;

public class Person {

	private List<String> freinds;

	public List<String> getFriend() {
		return freinds;
	}

	public void setFriend(List<String> freinds) {
		this.freinds = freinds;
	}

	@Override
	public String toString() {
		return "Person [friend=" + freinds + "]";
	}
	
}
