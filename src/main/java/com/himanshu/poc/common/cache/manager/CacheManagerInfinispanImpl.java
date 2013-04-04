package com.himanshu.poc.common.cache.manager;

import org.infinispan.manager.CacheContainer;
import org.infinispan.manager.DefaultCacheManager;

import com.himanshu.poc.common.cache.Cache;
import com.himanshu.poc.common.cache.CacheInfinispanImpl;

public class CacheManagerInfinispanImpl implements CacheManager {


	private CacheContainer container;

	@Override
	public Cache<?, ?> lookupJndiCache(String name) {
		Cache<?, ?> cache = null;
		//cache = new CacheInfinispanImpl<Object, Object>(container.getCache(name));
		cache = createCache(container.getCache(name));
		return cache;
	}

	@Override
	public Cache<?, ?> lookupCache(String name) {
		Cache<?, ?> cache = null;
		org.infinispan.Cache<Object, Object> jCache = new DefaultCacheManager().getCache(name);
		//cache = new CacheInfinispanImpl<Object, Object>(jCache);
		cache = createCache(jCache);
		return cache;
	}

	private <K, T> Cache<K, T> createCache (org.infinispan.Cache<K, T> cache) {
		return new CacheInfinispanImpl<K, T>(cache);
	}

}
