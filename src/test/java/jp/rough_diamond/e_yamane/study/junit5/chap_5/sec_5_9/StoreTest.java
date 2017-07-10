package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(StoreExtension.class)
public class StoreTest {
	@Test
	void foo() {}
	@Test
	void bar() {}
}
