package org.doubt;


public class Employee {
	// Can use for all object,commom for class
	//Object not required


	
	public Employee() {
		this("Ganesh");

		System.out.println("Print Employee");
		

}
	
	public Employee(int age) {
		System.out.println(age);
	
	
	}
	Employee(String name){
		this(10000l);
		System.out.println(name);
	}
	
	Employee(long salary){
       this(30);
		System.out.println(salary);
	}
	
	
public static void main(String[] args) {
	Employee emp=new Employee();
	
}

}
