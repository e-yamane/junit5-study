package jp.rough_diamond.e_yamane.study.junit5;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class AssertionsTest {

	@Test
	void standardAssertions() {
		assertEquals(2, 2);
		assertEquals(4, 4, "The optional assertion message is now the last parameter.");
		assertTrue(2 == 1, () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily.");
	}

	@Test
	void groupedAssertions() {
		// In a grouped assertion all assertions are executed, and any
		// failures will be reported together.
		assertAll("address", 
				() -> assertEquals("John", "John"), 
				() -> assertEquals("User", "User"));
	}

	@Test
	void exceptionTesting() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("a message");
		});
		assertEquals("a message", exception.getMessage());
	}

	@Test
	void timeoutNotExceeded() {
		// The following assertion succeeds.
		assertTimeout(ofMinutes(2), () -> {
			// Perform task that takes less than 2 minutes.
		});
	}

	@Test
	void timeoutNotExceededWithResult() {
		// The following assertion succeeds, and returns the supplied object.
		String actualResult = assertTimeout(ofMinutes(2), () -> {
			return "a result";
		});
		assertEquals("a result", actualResult);
	}

	@Test
	void timeoutNotExceededWithMethod() {
		// The following assertion invokes a method reference and returns an
		// object.
		String actualGreeting = assertTimeout(ofMinutes(2), AssertionsTest::greeting);
		assertEquals("hello world!", actualGreeting);
	}

	@Test
	void timeoutExceeded() {
		// The following assertion fails with an error message similar to:
		// execution exceeded timeout of 10 ms by 91 ms
		assertTimeout(ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(100);
			System.out.println("Wake up timeoutExceeded");
		});
	}

	@Test
	void timeoutExceededWithPreemptiveTermination() {
		// The following assertion fails with an error message similar to:
		// execution timed out after 10 ms
		assertTimeoutPreemptively(ofMillis(10), () -> {
			try {
				// Simulate task that takes more than 10 ms.
				Thread.sleep(100);
				System.out.println("Wake up timeoutExceededWithPreemptiveTermination");
			} catch(InterruptedException e) {
				System.out.println("Interrupted timeoutExceededWithPreemptiveTermination");
				throw e;
			}
		});
	}

	private static String greeting() {
		return "hello world!";
	}

//	@Test
//	void linesMatch() {
//		assertLinesMatch(Arrays.asList("[^@]+@[^@]+"), Arrays.asList("eijiyamane@gmail.com"));
//	}
	
//	@Test
//	void 並列実行試験１() {
//		assertAll("address", () -> {
//			for (int i = 0; i < 10; i++) {
//				Thread.sleep(100);
//				System.out.println(i);
//			}
//			assertEquals("John", "John");
//		}, () -> {
//			for (int i = 0; i < 10; i++) {
//				Thread.sleep(100);
//				System.out.println(i);
//			}
//			assertEquals("User", "User");
//		});
//	}
//
//	@Test
//	void 並列実行試験２() {
//		List<Executable> tmp = Arrays.asList(() -> {
//			for (int i = 0; i < 10; i++) {
//				Thread.sleep(100);
//				System.out.println(i);
//			}
//			assertEquals("John", "john");
//		}, () -> {
//			for (int i = 0; i < 10; i++) {
//				Thread.sleep(100);
//				System.out.println(i);
//			}
//			assertEquals("User", "user");
//		});
//		assertAll("address", tmp.parallelStream());
//	}
}