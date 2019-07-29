package com.rahulit.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excercise1 {
	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(
					new Person("Rahul", "N", 32),
					new Person("Raghu", "Vamshi", 30),
					new Person("Srinivas", "P", 33),
					new Person("Chaitanya", "Krishna", 26)
				);
		//List<Person> persons2=persons.
		//Step1 : Sort List by name
		//Step2: Create a method that prints all elements in the list
		//Step3: Create a method that prints people have last name begins with V
		Comparator<Person> nameSorter=(p1,p2)->p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		Collections.sort(persons, nameSorter);
		/*for(Person p:persons) {
			System.out.println(p.toString());
		}
		for(Person p:persons) {
			if(p.getLastName().startsWith("V"))
			System.out.println(p.toString());
		}*/
		System.out.println("---------v--------------------");
		printConditionally(persons, p->p.getLastName().startsWith("V"));
		
		System.out.println("---------R--------------------");
		printConditionally(persons, p->p.getFirstName().startsWith("R"));
		
		System.out.println("---------Print All--------------------");
		printConditionally(persons, p->true);
		
	}
	static void printConditionally(List<Person> persons,Condition condition) {
		for(Person p:persons) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
	interface Condition{
		boolean test(Person p);
	}
}
