package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_11.ex1;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;

@Tag("3.10")
@RunWith(JUnitPlatform.class)
class TestInterfaceTest implements TestLifecycleLogger, TimeExecutionLogger, TestInterfaceDynamicTestsDemo {
    @Test
    void isEqualValue() {
        assertEquals(1, 1, "is always equal");
    }

}
