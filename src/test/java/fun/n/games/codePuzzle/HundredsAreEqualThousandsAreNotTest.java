package fun.n.games.codePuzzle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HundredsAreEqualThousandsAreNotTest {

	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.codePuzzle.ThousandsAreEqualHundredsAreNot");

	@Test
	public void test() {

		// This will go through. Should be True.
		logger.debug("Is 100==100? {}.", 100 == 100);
		assertTrue(100 == 100);

		// This will go through as well. Should be True.
		logger.debug("Is 1000==1000? {}.", 1000 == 1000);
		assertTrue(1000 == 1000);

		// This should not go through. == checks if they are the same object.
		// They are not bothered about the values.
		Integer aa = 100, bb = 100;
		logger.debug("Is 100==100? {}.", aa == bb);
		assertTrue(aa == bb);
		// Ahh - but it goes through. It comes out True
		// IntegerCache caches low numbers. -128 to 127

		// This is back to normal. It fails.
		// They are two different objects.
		Integer a = 1000, b = 1000;
		logger.debug("Is 1000==1000? {}.", a == b);
		assertTrue(a == b);

	}

}
