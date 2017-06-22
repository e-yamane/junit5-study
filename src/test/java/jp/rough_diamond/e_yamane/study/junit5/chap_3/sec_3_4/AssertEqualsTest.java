package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertEqualsTest {
	final int x = 1;
	final int y = 2;
	final int ans = 3;
	
	@Test
	void directString() throws Throwable {
		System.out.println("directString");
		Executable exec = () -> assertEquals(x + y, ans, message(x, y, ans));
		testIt(exec);
	}
	
	@Test
	void useLamda() throws Throwable {
		System.out.println("useLamda");
		Executable exec = () -> assertEquals(x + y, ans, () -> message(x, y, ans));
		testIt(exec);
	}

	private void testIt(Executable exec) throws Throwable {
		long before = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; i++) {
			exec.execute();
		}
		System.out.println(System.currentTimeMillis() - before);
	}

	String message(int x, int y, int ans) {
		return String.format("%d + %d が %dじゃありません", x, y, ans);
	}
}
