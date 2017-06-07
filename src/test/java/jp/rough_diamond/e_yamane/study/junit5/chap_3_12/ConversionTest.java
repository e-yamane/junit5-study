package jp.rough_diamond.e_yamane.study.junit5.chap_3_12;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("3.12")
public class ConversionTest {
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion(TimeUnit argument) {
		System.out.println("testWithImplicitArgumentConversion_" + argument);
	}

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithExplicitArgumentConversion(@ConvertWith(ToStringArgumentConverter.class) String argument) {
	    System.out.println("testWithExplicitArgumentConversion_" + argument);
	}

	static class ToStringArgumentConverter extends SimpleArgumentConverter {
	    @Override
	    protected Object convert(Object source, Class<?> targetType) {
	        assertEquals(String.class, targetType, "Can only convert to String");
	        return String.valueOf(source);
	    }
	}

	@ParameterizedTest
	@ValueSource(strings = { "01.01.2017", "31.12.2017" })
	void testWithExplicitJavaTimeConverter(@JavaTimeConversionPattern("dd.MM.yyyy") LocalDate argument) {
	    System.out.println("testWithExplicitJavaTimeConverter_" + argument);
	}
}
