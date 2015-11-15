package fun.n.games.java8lambda;

import static org.junit.Assert.assertTrue;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Person.java
//https://docs.oracle.com/javase/tutorial/java/javaOO/examples/RosterTest.java

public class RosterTest {
	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.java8lambda.RosterTest");

	List<Person> roster;

	@Before
	public void initialize() {
		roster = new ArrayList<Person>();
		roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980, 6, 20),
				Person.Sex.MALE, "fred@example.com"));
		roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990, 7, 15),
				Person.Sex.FEMALE, "jane@example.com"));
		roster.add(new Person("George", IsoChronology.INSTANCE
				.date(1991, 8, 13), Person.Sex.MALE, "george@example.com"));
		roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000, 9, 12),
				Person.Sex.MALE, "bob@example.com"));

	}

	@Test
	public void test() {

		for (Person p : roster) {
			logger.debug("Person.toString is {}", p.toString());

		}

		assertTrue(false);
	}

}
