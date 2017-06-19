package jp.rough_diamond.e_yamane.study.junit5.chap_5_2_3;

public class ParameterFooResolver1 extends AbstractParameterFooResolver {
	public ParameterFooResolver1() {
		System.out.println("create ParameterFooResolver1");
	}
	@Override
	protected String getText() {
		return "resolver-1";
	}
}
