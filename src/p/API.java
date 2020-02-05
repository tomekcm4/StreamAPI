package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class API {

	ArrayList<Employee> employees = new ArrayList<Employee>();

	public void setUP() {

		Employee employee1 = new Employee("Snozzlebert", "Creamsicle", 25, Arrays.asList("A"));
		Employee employee2 = new Employee("Beezlebub", "Crimpysnitch", 25, Arrays.asList("B"));
		Employee employee3 = new Employee("Boobytrap", "Carrotstick", 25, Arrays.asList("C"));
		Employee employee5 = new Employee("Bumblebee", "Ampersand", 25, Arrays.asList("D"));
		Employee employee4 = new Employee("Bombadil", "Kryptonite", 25, Arrays.asList("E"));
		Employee employee6 = new Employee("Biblical", "Concubine", 25, Arrays.asList("F"));
		Employee employee7 = new Employee("Johnnycash", "Lingerie", 25, Arrays.asList("G"));
		Employee employee8 = new Employee("Johnnycash", "Banglesnatch", 25, Arrays.asList("H"));

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		employees.add(employee8);
	}

	public void firstStream() {

		employees.forEach(System.out::println);
	}

	public void mapStream() {

		employees.stream().map(Employee::getFirstName).forEach(System.out::println);
	}

	public void flatMapStream() {

		List<String> allSkills = employees.stream().map(Employee::getSkills).flatMap(list -> list.stream())
				.collect(Collectors.toList());

		System.out.println(allSkills);
	}

}
