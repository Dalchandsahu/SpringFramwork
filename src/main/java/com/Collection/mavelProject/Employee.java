package com.Collection.mavelProject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	String name;
	List<String> ids;
	Set<String> address;
	Map<String, String> courses;
	Properties city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getIds() {
		return ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getCity() {
		return city;
	}
	public void setCity(Properties city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ids=" + ids + ", address=" + address + ", courses=" + courses + ", city="
				+ city + "]";
	}
	public Employee(String name, List<String> ids, Set<String> address, Map<String, String> courses, Properties city) {
		super();
		this.name = name;
		this.ids = ids;
		this.address = address;
		this.courses = courses;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
