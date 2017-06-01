package jp.rough_diamond.e_yamane.study.junit5.chap_3_10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;

@Tag("3.10")
class TestInterfaceTest implements TestLifecycleLogger, TimeExecutionLogger, TestInterfaceDynamicTestsDemo {
    @Test
    void isEqualValue() {
        assertEquals(1, 1, "is always equal");
    }

}
