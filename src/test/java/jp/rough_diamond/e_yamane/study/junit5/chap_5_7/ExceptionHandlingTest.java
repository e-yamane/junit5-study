package jp.rough_diamond.e_yamane.study.junit5.chap_5_7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(ExceptionHandler.class)
public class ExceptionHandlingTest {
	ExceptionHandlingTest() {
		System.out.println("constructor");
//		throw new RuntimeException();
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("before All");
//		throw new RuntimeException();
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
//		throw new RuntimeException();
	}
	
	@Test
	void foo() {
		System.out.println("test execution");
//		assertEquals(1 + 1, 3);
		throw new RuntimeException();
	}
	
	@TestFactory
	List<DynamicTest> testFactory1() {
		System.out.println("test faxctory 1");
//		throw new RuntimeException();
		return Arrays.asList(DynamicTest.dynamicTest("aaa", () -> {}));
	}
	
	@TestFactory
	List<DynamicTest> testFactory2() {
		return Arrays.asList(DynamicTest.dynamicTest("dynamicTest2", () -> {
			System.out.println("dynamic test");
//			throw new RuntimeException();
		}));
	}
}
