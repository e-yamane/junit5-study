package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_10;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(AllCallbacker.class)
public class CallBackOrderTest {
//	@Nested
//	class Hoge {
		@Test
		void foo() {
			System.out.println("foo");
			throw new RuntimeException();
		}
//	}
}
