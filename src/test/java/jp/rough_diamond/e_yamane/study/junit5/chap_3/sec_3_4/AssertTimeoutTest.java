package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import static java.time.Duration.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertTimeoutTest {
	private ThreadLocal<String> tl = new ThreadLocal<>();
	
	@Test
	void testThreadLocal() {
		tl.set("hoge");
		System.out.println(Thread.currentThread().getName() + ":" + tl.get());
		assertTimeoutPreemptively(ofSeconds(1L), () -> {
			System.out.println(Thread.currentThread().getName() + ":" + tl.get());
		});
	}

	@Test
	void timeoutExceeded() {
		// The following assertion fails with an error message similar to:
		// execution exceeded timeout of 10 ms by 91 ms
		assertTimeout(ofMillis(10), () -> {
			// Simulate task that takes more than 10 ms.
			Thread.sleep(100);
			System.out.println("Wake up timeoutExceeded");
		});
	}

	@Test
	void timeoutExceededWithPreemptiveTermination() {
		// The following assertion fails with an error message similar to:
		// execution timed out after 10 ms
		assertTimeoutPreemptively(ofMillis(10), () -> {
			try {
				// Simulate task that takes more than 10 ms.
				Thread.sleep(100);
				System.out.println("Wake up timeoutExceededWithPreemptiveTermination");
			} catch(InterruptedException e) {
				System.out.println("Interrupted timeoutExceededWithPreemptiveTermination");
				throw e;
			}
		});
	}
	
	@Test
	void 戻り値受け取れるよ() {
		int ans = assertTimeout(ofMillis(10), () -> add(1, 1));
		assertEquals(2, ans);
	}

	@Test
	void 例外も受け取れるよ() {
		Throwable t = assertTimeout(ofMillis(10), () -> new RuntimeException("zzz"));
		assertEquals(t.getMessage(), "zzz");
	}
	
	private int add(int i, int j) {
		return i + j;
	}
}
