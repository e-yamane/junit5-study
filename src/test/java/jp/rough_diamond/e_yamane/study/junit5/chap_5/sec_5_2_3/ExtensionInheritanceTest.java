package jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_2_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import jp.rough_diamond.e_yamane.study.junit5.chap_5.sec_5_2_1.ExtendWithTest.FooExtension;

@RunWith(JUnitPlatform.class)
public class ExtensionInheritanceTest implements ExtensionInheritanceIF {
	@Test
	void testIt() {}
}

@ExtendWith(FooExtension.class)
interface ExtensionInheritanceIF {
}
