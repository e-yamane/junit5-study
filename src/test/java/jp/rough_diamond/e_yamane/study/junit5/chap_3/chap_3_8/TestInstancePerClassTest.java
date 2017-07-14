package jp.rough_diamond.e_yamane.study.junit5.chap_3.chap_3_8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
public class TestInstancePerClassTest {
	private int i = 0;
	
	@Test
	void test1(){System.out.println(i++);}
	@Test
	void test2(){System.out.println(i++);}
}
