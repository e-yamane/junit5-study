package jp.rough_diamond.e_yamane.study.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstJUnit5Tests {
	@Test
	void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}
