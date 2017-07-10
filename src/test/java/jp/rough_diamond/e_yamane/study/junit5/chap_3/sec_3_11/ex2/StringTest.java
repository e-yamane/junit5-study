package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_11.ex2;

import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@Tag("3.10")
@RunWith(JUnitPlatform.class)
class StringTest implements ComparableContract<String>, EqualsContract<String> {

    @Override
    public String createValue() {
        return "foo";
    }

    @Override
    public String createSmallerValue() {
        return "bar"; // 'b' < 'f' in "foo"
    }

    @Override
    public String createNotEqualValue() {
        return "baz";
    }
}