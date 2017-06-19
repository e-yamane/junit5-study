package jp.rough_diamond.e_yamane.study.junit5.chap_5_8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(LifeCycleCheckExtention1.class)
@ExtendWith(LifeCycleCheckExtention2.class)
public class StoreLifeCycleTest {
	@Test
	void foo() {}

	@Test
	void bar() {}
}
