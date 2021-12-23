package demo.mavenDemo;

public class Emp {
	int eid,esalary;
	String ename,eaddress;
	public Emp(int eid, int esalary, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.esalary = esalary;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	void display() {
		System.out.println("Id :"+eid+" Salary :"+esalary+" Name :"+ename+" Address :"+eaddress);
	}

}
