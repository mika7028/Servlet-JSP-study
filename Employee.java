package model;

public class Employee {
	private String id;
	private String name;
	public Employee(String id, String name){
		this.id = id; this.name = name;
	}
	public String getID(){return id;}
	public String getName(){return name;}
}
