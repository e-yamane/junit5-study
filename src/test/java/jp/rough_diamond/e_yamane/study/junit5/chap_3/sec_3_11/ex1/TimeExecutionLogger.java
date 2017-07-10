package jp.rough_diamond.e_yamane.study.junit5.chap_3.sec_3_11.ex1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("timed")
@ExtendWith(TimingExtension.class)
public interface TimeExecutionLogger {

}
