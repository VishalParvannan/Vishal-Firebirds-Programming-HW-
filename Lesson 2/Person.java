package frcstuff;

public class Person {

	String name;
	int age;
	double annualSalary;
	double monthlySpending;
	
	public Person(String name, int age, double annualSalary, double monthlySpending) {
		super();
		this.name = name;
		this.age = age;
		this.annualSalary = annualSalary;
		this.monthlySpending = monthlySpending;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getMonthlySpending() {
		return monthlySpending;
	}

	public void setMonthlySpending(double monthlySpending) {
		this.monthlySpending = monthlySpending;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", annualSalary=" + annualSalary + ", monthlySpending="
				+ monthlySpending + "]";
	}
	
	
	
	
    
	
}
