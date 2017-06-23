package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.stream.Stream;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ContainerExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ObjectArrayArguments;
import org.junit.jupiter.params.support.AnnotationConsumer;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.12")
@RunWith(JUnitPlatform.class)
public class MoreGenericPerameterizedTest {
	@ParameterizedTest
	@HogeSource({"1", "2", "3"})
	void test(String val) {
		System.out.println("MoreGenericPerameterizedTest_" + val);
	}
	
	@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
	@Retention(RetentionPolicy.RUNTIME)
	@ArgumentsSource(HogeProvider.class)
	public static @interface HogeSource {
		String[] value();
	}

	static class HogeProvider implements ArgumentsProvider,AnnotationConsumer<HogeSource> {
		private String[] value;
	    @Override
	    public Stream<? extends Arguments> arguments(ContainerExtensionContext context) {
	        return Stream.of(value).map(ObjectArrayArguments::create);
	    }

		@Override
		public void accept(HogeSource t) {
			this.value = t.value();
		}
	}
}
