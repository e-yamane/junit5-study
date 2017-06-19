package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;

public class ExtendWithDemo {
	@ExtendWith({Foo.class, Bar.class})
	void foo() {}

	@ExtendWith(Foo.class)
	@ExtendWith(Bar.class)
	void bar() {}
	
	public static class Foo implements Extension {
	}

	public static class Bar implements Extension {
	}
}
