package fun.n.games.java8lambda;

import java.time.LocalDate;

import lombok.Data;

//https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Person.java

@Data
public class Person {
	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
		name = nameArg;
		birthday = birthdayArg;
		gender = genderArg;
		emailAddress = emailArg;
	}

	public int getAge() {
		// TODO: Add some logic.
		return 0;

	}

	public void printPerson() {
		System.out.println();
		// TODO: Add some logic.
	}

}
