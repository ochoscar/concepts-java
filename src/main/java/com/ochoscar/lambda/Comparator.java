package com.ochoscar.lambda;

@FunctionalInterface
public interface Comparator<K> {

	public abstract boolean op(K arg1, K arg2);
	
}
