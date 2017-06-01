package jp.rough_diamond.e_yamane.study.junit5.chap_3_10;

import org.junit.jupiter.api.Tag;

@Tag("3.10")
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