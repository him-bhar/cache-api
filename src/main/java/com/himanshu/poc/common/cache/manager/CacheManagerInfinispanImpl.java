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
		cache = new com.himanshu.poc.common.cache.CacheInfinispanImpl<Object, Object>(container.getCache(name));
		return cache;
	}

	@Override
	public com.himanshu.poc.common.cache.Cache<?, ?> lookupCache(String cacheName) {
		Cache<?, ?> cache = null;
		org.infinispan.Cache<Object, Object> jCache = new DefaultCacheManager().getCache();
		cache = new CacheInfinispanImpl<Object, Object>(jCache);
		return cache;
	}

}
