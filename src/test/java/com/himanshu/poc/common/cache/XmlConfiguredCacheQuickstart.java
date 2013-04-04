package com.himanshu.poc.common.cache;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

public class XmlConfiguredCacheQuickstart {

	public static void main(String args[]) throws Exception {
		Cache<Object, Object> c = new DefaultCacheManager("infinispan.xml").getCache("xml-configured-cache");
		c.put("dd", "fff");
	}

}