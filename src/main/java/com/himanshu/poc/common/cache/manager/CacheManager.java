package com.himanshu.poc.common.cache.manager;

import com.himanshu.poc.common.cache.Cache;

public interface CacheManager {
	Cache<?, ?> lookupJndiCache (String jndiName);
	Cache<?, ?> lookupCache (String cacheName);
}
