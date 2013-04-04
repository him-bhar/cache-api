package com.himanshu.poc.common.cache;

public class CacheInfinispanImpl<K, T> implements Cache<K, T> {

	private org.infinispan.Cache<K, T> cache;

	public CacheInfinispanImpl (org.infinispan.Cache<K, T> cache) {
		this.cache = cache;
	}

	@Override
	public boolean containsKey(K k) {
		return cache.containsKey(k);
	}

	@Override
	public T getValue(K key) {
		return cache.get(key);
	}

	@Override
	public void remove(K key) {
		cache.remove(key);
	}

	@Override
	public void put(K k, T t) {
		cache.put(k, t);
	}
}
