package fun.n.games.java8lambda;

import java.util.function.IntBinaryOperator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLamda001 {

	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.java8lambda.TestLamda001");

	@Test
	public void test() {

		// MyFunctionalInterfaceWithTwoArg is my own functional interface.
		MyFunctionalInterfaceWithTwoArg addition = (a, b) -> a + b;
		logger.debug("The addition of 10 and 20 is {}.",
				addition.execute(10, 20));

		MyFunctionalInterfaceWithTwoArg multiplication = (a, b) -> a * b;
		logger.debug("Multiplication of 10 and 20 is {}.",
				multiplication.execute(10, 20));

		// IntBinaryOperator is functional interface provided off the shelf
		IntBinaryOperator add = (a, b) -> a + b;
		logger.debug("The add of 10 and 20 is {}.", add.applyAsInt(10, 20));
		IntBinaryOperator multi = (a, b) -> a * b;
		logger.debug("Multi of 10 and 20 is {}.", multi.applyAsInt(10, 20));

		// fail("Not yet implemented");
	}
}
