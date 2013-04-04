package com.himanshu.poc.common.cache;

import java.util.concurrent.TimeUnit;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

public class CacheTest {

	public static void main(String[] args) throws InterruptedException {
		Cache<Object, Object> cache = new DefaultCacheManager().getCache();
		cache.put("Test", "Test", 5, TimeUnit.SECONDS);

		Thread.sleep(10000);
		if(cache.containsKey("Test")) {
			System.out.println("found");
		} else {
			System.out.println("NOT found");
		}
	}

}
