package jp.rough_diamond.e_yamane.study.junit5.chap_3_7;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
class TaggingTest {

    @Test
    @Tag("taxes")
    @Tag("xxx")
    void testingTaxCalculation() {
    }

    @Test
    @Tags({@Tag("xxx"), @Tag("taxes")})
    void testTags() {
    	
    }

    @Test
    void notTag() {}
}