package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertAllTest {
	@Test
	void simple() {
		// In a grouped assertion all assertions are executed, and any
		// failures will be reported together.
		assertAll("address", 
				() -> assertEquals("John", "John"), 
				() -> assertEquals("User", "User"),
				() -> assertEquals(2, 1 + 1));
	}

	@Test
	void useParallelStream() {
		List<Executable> tmp = Arrays.asList(() -> {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(100);
				System.out.println(i);
			}
			assertEquals("John", "John");
		}, () -> {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(100);
				System.out.println(i);
			}
			assertEquals("User", "User");
		});
		assertAll("address", tmp.parallelStream());
	}
}
