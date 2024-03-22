package com.aasiln.override2;
/**
 * 
 * @author lavanya
 * Employee Inheritance Override-
 * 
 */
//Employee superclass
class Employee {
	 String name;
	 double salary;
	 
// Constructor of Employee class

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double calculateBonus() {
		return 0;
	}
}

//Manager subclass
class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return 0.1 * salary;
	}
}

//Engineer subclass
class Engineer extends Employee {
	public Engineer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return 0.05 * salary;
	}
}
//main class
public class Override_Example2 {
	public static void main(String[] args) {
		// Testing the hierarchy of instances of Manager and Engineer
		Manager m = new Manager("lavanya", 15000);
		Engineer e = new Engineer("resh", 20000);
		

		System.out.println("Manager " + m.name + " bonus " + m.calculateBonus());
		System.out.println("Engineer " + e.name + "  bonus " + e.calculateBonus());
	}
}
