package demo.mavenDemo;

public class Book {
	int id,price;
	 String publisher;
	public Book(int id, int price, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}
	void display() {
		 System.out.println("Id :"+id+" Rollno :"+price+" Publisher :"+publisher);
	 }
}
