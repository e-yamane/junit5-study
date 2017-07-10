package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_13.MoreGenericPerameterizedTest.HogeProvider;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class ExplicitConversionTest {
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithExplicitArgumentConversion(@ConvertWith(ToStringArgumentConverter.class) String argument) {
	    System.out.println("testWithExplicitArgumentConversion_" + argument);
	}

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testWithExplicitArgumentConversion2(@ToString String argument) {
	    System.out.println("testWithExplicitArgumentConversion2_" + argument);
	}
	
	@Target({ ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
	@Retention(RetentionPolicy.RUNTIME)
	@ConvertWith(ToStringArgumentConverter.class)
	public static @interface ToString {}

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
