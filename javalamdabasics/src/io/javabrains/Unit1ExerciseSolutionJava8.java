package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
				
		System.out.println("Print all people");
		printConditionally(people, p1 -> true);
		System.out.println("Print people with last name beginning with C");
		printConditionally(people, p1 -> p1.getLastName().startsWith("C"));
		System.out.println("Print people with first name beginning with C");
		printConditionally(people, p1 -> p1.getFirstName().startsWith("C"));
	}

	public static void printConditionally(List<Person> people, Condition condition) {
		for(Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
		}
	}
}



