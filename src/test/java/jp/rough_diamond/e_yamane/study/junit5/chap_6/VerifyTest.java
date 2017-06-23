package jp.rough_diamond.e_yamane.study.junit5.chap_6;

import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.migrationsupport.rules.VerifierSupport;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.rules.Verifier;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExtendWith(VerifierSupport.class)
public class VerifyTest {
	@Rule
	public Verifier v = new Verifier() {
		@Override
		protected void verify() throws Throwable {
			fail();
		}
	};
	
	@Test
	void foo() {}
}
