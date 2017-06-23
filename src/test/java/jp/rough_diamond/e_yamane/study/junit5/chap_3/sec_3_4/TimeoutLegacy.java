package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_4;

import org.junit.Test;

public class TimeoutLegacy {
	@Test(timeout=100)
	public void foo() throws Exception {
		//事前条件処理
		Thread.sleep(50L);
		//本番処理
		Thread.sleep(30L);
		//検証処理
		Thread.sleep(40L);
	}
}
