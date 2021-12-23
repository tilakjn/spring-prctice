package demo.mavenDemo;

public class Student {
	String name;
	int roll;
	public Student() {
		
	}
	
	public Student(String name, int roll) {
		
		this.name = name;
		this.roll = roll;
	}
	void display() {
		 System.out.println("Name :"+name+" Rollno :"+roll);
	 }

}
