package models;

public class Service {

	private String name;
	private int hours;
	private int persons;

	public Service(String name, int hours, int persons) {
		this.name = name;
		this.hours = hours;
		this.persons = persons;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return 1242 * hours * persons;
	}

	public void print() {
		System.out.println(persons + " persons for " + hours + "h of " + getName());
	}
}
