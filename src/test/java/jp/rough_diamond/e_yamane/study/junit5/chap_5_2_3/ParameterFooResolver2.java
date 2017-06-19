package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_3;

public class ParameterFooResolver2 extends AbstractParameterFooResolver {
	public ParameterFooResolver2() {
		System.out.println("create ParameterFooResolver2");
	}
	@Override
	protected String getText() {
		return "resolver-2";
	}
}
