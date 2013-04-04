package com.himanshu.poc.common.cache;

public interface Cache<K, T> {

	boolean containsKey(K k);
	T getValue (K key);
	void remove(K key);
	void put(K k, T t);
}
