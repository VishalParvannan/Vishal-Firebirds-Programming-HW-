package frcstuff;

import java.util.Scanner;

public class PersonExercise {

	static Person[] personArray = new Person[5]; 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		personArray[0] = new Person("Jeff", 17, 30000, 15000);
		personArray[1] = new Person("Avery", 25, 70000, 30000);
		personArray[2] = new Person("Porter", 35, 100000, 60000);
		personArray[3] = new Person("Jamal", 22, 60000, 20000);
		personArray[4] = new Person("Emily", 14, 15000, 5000);
		
		printPersonObject();
		findNetWorth();
		determineRelationships(personArray[0], personArray[1]);
		determineRelationships(personArray[2], personArray[3]);
		determineRelationships(personArray[0], personArray[4]);

	}
	
	private static void printPersonObject() {
		
		for (Person person: personArray) {
			System.out.printf("Hi, my name is %s. I am %d years old, and I make $%.2f dollars per year. "
					+ "\nI average around %.2f in monthly spendings\n\n", person.getName(), person.getAge(), 
					person.getAnnualSalary(), person.getMonthlySpending());
		}
		
	}
	
	private static void findNetWorth() {
		double NetWorth;
		
		for (Person person: personArray) {
			NetWorth = person.getAnnualSalary() - person.getMonthlySpending();
			
			System.out.printf("%s's total net worth is $%.2f dollars\n", person.getName(), NetWorth);
			
		}
		
		System.out.println();
	}

	private static void determineRelationships(Person a, Person b) {
		String[] relationships = {"friends", "colleagues", "enemies", "siblings", "acquaintances"};
        int index = (int)(Math.random() * relationships.length);
        System.out.println(a.getName() + " and " + b.getName() + " are " + relationships[index] + ".");

		
	}

}
