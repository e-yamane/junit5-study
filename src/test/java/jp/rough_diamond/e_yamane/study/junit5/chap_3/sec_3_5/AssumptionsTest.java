package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssumptionsTest {

    @Test
    void testAssumeTrue() {
        assumeTrue(false,
            () -> "Aborting test: not on developer workstation");
        // remainder of test
    }

    @Test
    void testInAllEnvironments() {
        assumingThat(false,
            () -> {
                // perform these assertions only on the CI server
                assertEquals(2, 3);
            });

        // perform these assertions in all environments
        assertEquals("a string", "a string");
    }

}