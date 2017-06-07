package jp.rough_diamond.e_yamane.study.junit5.chap_3_12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("3.12")
public class CsvSourceParameterizedTest {
	@ParameterizedTest
	@CsvSource({ "foo, 	1", "bar, 2", "'baz, qux', 3","," })
	void testWithCsvSource(String first, Integer second) {
		System.out.printf("testWithCsvSource_first:[%s],second:[%d]\n", first, second);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "two-column.csv")
	void testWithCsvFileSource(String first, int second) {
		System.out.printf("testWithCsvFileSource_first:[%s],second:[%d]\n", first, second);
	}
}
