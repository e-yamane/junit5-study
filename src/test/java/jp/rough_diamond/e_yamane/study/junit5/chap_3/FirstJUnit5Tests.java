package jp.rough_diamond.e_yamane.study.junit5.chap_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class FirstJUnit5Tests {
	@Test
	void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println(LocalDate.of(2016, 10, 29).plusDays(120));
    }
}
