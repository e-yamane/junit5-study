package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@Tag("CustomizingDisplayNamesTest")
@RunWith(JUnitPlatform.class)
public class CustomizingDisplayNamesTest {
	@DisplayName("add")	//DisplayNameを消すとゴミが出る
	@ParameterizedTest(name="{0} + {1} = {2}である事")
	@CsvSource({"1,2,3", "2,3,5"})
	void add(int x, int y, int z) {
		assertEquals(z, x + y);
	}
	
	@DisplayName("Display name of container")
	@ParameterizedTest(name = "{index} ==> first=''{0}'', second={1}")
	@CsvSource({ "foo, 1", "bar, 2", "'baz, qux', 3" })
	void testWithCustomDisplayNames(String first, int second) {
	}
}
