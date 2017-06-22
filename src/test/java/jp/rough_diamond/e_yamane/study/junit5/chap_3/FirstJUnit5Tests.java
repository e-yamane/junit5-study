package jp.rough_diamond.e_yamane.study.junit5.chap_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class FirstJUnit5Tests {
	@Test
	void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}
