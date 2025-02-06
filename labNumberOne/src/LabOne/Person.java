package LabOne;

	public class Person {
		
		//Declare variables
	private String name = "";
	
		//Setters and getters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
		//Greet function
	public String greet() {
		return "Hello " + name;
	} 
	
	public static void main(String[] args) {
			//Create Person object
		Person person = new Person();
		person.setName("Tony");
		
		System.out.println(person.greet());
	}

}
