package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class DisabledClassTest {
    @Test
    void testWillBeSkipped() {
    }
}