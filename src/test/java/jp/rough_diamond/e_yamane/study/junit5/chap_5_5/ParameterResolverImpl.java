package jp.rough_diamond.e_yamane.study.junit5.chap_5_5;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ParameterResolverImpl implements ParameterResolver {
	@Override
	public boolean supports(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		return parameterContext.getParameter().getType() == String.class;
	}

	@Override
	public Object resolve(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		return "abc";
	}
	
}
