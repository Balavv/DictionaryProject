package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMap {
	protected Map<String, String> map = new HashMap<>();

	String findByKey(String key) {
		return map.get(key);
	}

	String save(String key, String value) {

		if (key != null && value != null) {

			map.put(key, value);
		} else {
			throw new RuntimeException("Object cannot be null");
		}

		return key;
	}

	void deleteByKey(String key) {
		map.remove(key);
	}

}
