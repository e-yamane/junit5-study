package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_2;

import java.util.ServiceLoader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import jp.rough_diamond.e_yamane.study.junit5.chap_3_9.MockitoExtension;


@RunWith(JUnitPlatform.class)
public class AutomaticExtensionTest {
	@BeforeEach
	void before() {
		for(Extension e :  ServiceLoader.load(Extension.class)) {
			System.out.println(e.getClass().getName());
		}
	}
	
    @Test
    //@ExtendWith(MockitoExtension.class)
    void simpleTestWithInjectedMock(@Mock Person person) {
    	System.out.println(person);
    }

    static class Person {
    	String getName(){ return null;}
    }
}
